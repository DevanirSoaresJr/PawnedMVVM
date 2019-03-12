package devanir.soaresjunior.pawnedmvvmdcsj.net;

import java.util.List;

import devanir.soaresjunior.pawnedmvvmdcsj.model.Repo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static devanir.soaresjunior.pawnedmvvmdcsj.Constants.END_POINT;

public interface RepoService {
    @GET(END_POINT)
    Call<List<Repo>> getRepos(@Query("domain") String domain);
}
