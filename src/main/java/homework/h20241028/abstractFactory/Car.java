package homework.h20241028.abstractFactory;

public abstract class Car {
    CarType type;
    CarColor color;
    String name;

    Car(CarType type, CarColor color, String name) {
        this.type = type;
        this.color = color;
        this.name = name;
    }

    abstract void create();
}