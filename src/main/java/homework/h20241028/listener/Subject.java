package homework.h20241028.listener;

public interface Subject {
    void addObserver(Observer observer);

    void detachObserver(Observer observer);

    void notifyObservers();
}