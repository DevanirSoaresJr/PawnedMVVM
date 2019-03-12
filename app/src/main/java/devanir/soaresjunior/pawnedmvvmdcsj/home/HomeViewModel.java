package devanir.soaresjunior.pawnedmvvmdcsj.home;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import devanir.soaresjunior.pawnedmvvmdcsj.model.Repo;
import devanir.soaresjunior.pawnedmvvmdcsj.repo.DataSource;
import devanir.soaresjunior.pawnedmvvmdcsj.repo.LocalDataSource;
import devanir.soaresjunior.pawnedmvvmdcsj.repo.RemoteDataSource;
import devanir.soaresjunior.pawnedmvvmdcsj.repo.Repository;

public class HomeViewModel implements Observer {
    private final DataSource repository;
    private final MutableLiveData<List<Repo>> liveData = new MutableLiveData<>();

    public HomeViewModel() {
        repository = new Repository(new LocalDataSource(), new RemoteDataSource());
    }

    @Override
    public void update(Observable o, Object result) {

        List<Repo> repoList = (List<Repo>) result;
        liveData.setValue(repoList);
    }

    public LiveData<List<Repo>> getResponseLiveData(){
        return liveData;
    }

    public void getDomain(String domain){
        repository.setObserver(this);
        repository.getPawnedInfo(domain);
    }
}
