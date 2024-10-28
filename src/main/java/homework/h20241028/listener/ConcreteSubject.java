package homework.h20241028.listener;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
    private List<Observer> observers;
    public ConcreteSubject() {
        observers = new ArrayList<Observer>(); }
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer); }
    @Override
    public void detachObserver(Observer observer) {
        observers.remove(observer); }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}