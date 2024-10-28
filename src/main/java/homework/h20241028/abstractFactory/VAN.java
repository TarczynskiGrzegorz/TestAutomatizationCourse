package homework.h20241028.abstractFactory;

public class VAN extends Car {
    VAN( CarColor color, String name) {
        super(CarType.VAN, color, name);
        create();
    }

    @Override
    void create() {
        System.out.println("Creating: " + type + " " + name);
    }
}
