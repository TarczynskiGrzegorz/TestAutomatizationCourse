package homework.h20241028.abstractFactory;

public class CarAbstractFactory {
    Car car;

    Car createCar(CarType type) {
        CarColor color = getFromConfiguration();

        switch (color) {
            case WHITE:
                car = new WhiteCarFactory().createCar(type);
                break;
            case BLACK:
                car = new BlackCarFactory().createCar(type);
                break;
        }

        return car;
    }

    CarColor getFromConfiguration() {
        return CarColor.WHITE; // Default
    }
}