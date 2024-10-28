package homework.h20241028.factory;

public class ConcreteCreator implements Creator{
    @Override
    public Car createCar(String type) {
        Car car = switch (type) {
            case "BMW" -> new BMW();
            case "Mercedes" -> new Mercedes();
            default -> null;
        };
        return car;
    }
}
