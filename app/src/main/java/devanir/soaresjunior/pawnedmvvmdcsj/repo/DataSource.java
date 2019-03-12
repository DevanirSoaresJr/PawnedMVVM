package devanir.soaresjunior.pawnedmvvmdcsj.repo;

import java.util.Observer;

public interface DataSource {
    void getPawnedInfo(String domain);
    void setObserver(Observer observer);
}
