package homework.h20241028.listener;

public class Main {
    public static void main(String[] args) {
        ConcreteObserver co1 = new ConcreteObserver();
        ConcreteObserver co2 = new ConcreteObserver();
        ConcreteSubject cs = new ConcreteSubject();
        cs.addObserver(co1);
        cs.addObserver(co2);
        cs.notifyObservers();

    }
}
