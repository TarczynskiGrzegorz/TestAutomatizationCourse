package homework.h20241028.abstractFactory;

public class Main {
    public static void main(String[] args) {
        new CarAbstractFactory().createCar(CarType.SEDAN);
    }
}
