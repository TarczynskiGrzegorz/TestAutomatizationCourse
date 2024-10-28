package homework.h20241028.proxy;

public class Main {
    public static void main(String[] args) {
        CarCreation car = new CarCreationProxy();
        car.create();
        car.create();
    }
}
