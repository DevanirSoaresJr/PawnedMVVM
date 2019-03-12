package devanir.soaresjunior.pawnedmvvmdcsj.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;

import devanir.soaresjunior.pawnedmvvmdcsj.Constants;
import devanir.soaresjunior.pawnedmvvmdcsj.model.Repo;
import devanir.soaresjunior.pawnedmvvmdcsj.net.RepoService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RemoteDataSource extends Observable implements DataSource {

    private final RepoService repoService;

    public RemoteDataSource() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .connectTimeout(20, TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        repoService = retrofit.create(RepoService.class);
        RepoService repoService = retrofit.create(RepoService.class);


    }
    @Override
   public void getPawnedInfo(String domain) {
        final List<Repo> repoList = new ArrayList<>();

        repoService.getRepos(domain).enqueue(new Callback<List<Repo>>() {

            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                if(response.isSuccessful() && response.body() != null){
                    repoList.clear();
                    repoList.addAll(response.body());
                    setChanged();
                    notifyObservers(repoList);
                }
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable throwable) {
                throwable.printStackTrace();
            }
        });
    }

    @Override
    public void setObserver(Observer observer) {
        addObserver(observer);
    }


}

