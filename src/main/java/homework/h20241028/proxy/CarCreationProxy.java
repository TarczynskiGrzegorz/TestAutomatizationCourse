package homework.h20241028.proxy;

public class CarCreationProxy implements CarCreation{
    private static CarCreationImplementation car = new CarCreationImplementation();
    @Override
    public void create() {
        if (car==null){
            car = new CarCreationImplementation();
        }
        car.create();
    }
}
