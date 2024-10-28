package homework.h20241028.listener;

public class ConcreteObserver implements Observer{
    @Override
    public void update() {
        System.out.println("Updated");
    }
}