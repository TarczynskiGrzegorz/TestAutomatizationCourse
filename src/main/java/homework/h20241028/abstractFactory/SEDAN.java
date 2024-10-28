package homework.h20241028.abstractFactory;

public class SEDAN extends Car {

    SEDAN( CarColor color, String name) {
            super(CarType.SEDAN, color, name);
            create();
        }

        @Override
        void create() {
            System.out.println("Creating: " + type + " " + name);
        }

}
