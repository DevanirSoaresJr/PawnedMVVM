package devanir.soaresjunior.pawnedmvvmdcsj.repo;

import java.util.Observable;
import java.util.Observer;

public class Repository extends Observable implements Observer, DataSource {
    private final DataSource localDataSource;
    private final DataSource remoteDataSource;

    public Repository(DataSource localDataSource, DataSource remoteDataSource) {
        this.localDataSource = localDataSource;
        this.remoteDataSource = remoteDataSource;
    }



    @Override
    public void getPawnedInfo(String domain) {
        remoteDataSource.setObserver(this);
        remoteDataSource.getPawnedInfo(domain);
    }

    @Override
    public void setObserver(Observer observer) {

    }

    @Override
    public void update(Observable o, Object result) {
        setChanged();
        notifyObservers(result);
    }
}
