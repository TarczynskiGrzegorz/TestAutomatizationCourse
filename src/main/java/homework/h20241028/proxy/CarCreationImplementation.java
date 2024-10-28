package homework.h20241028.proxy;

public class CarCreationImplementation implements CarCreation{
    public CarCreationImplementation(){
        initialCreation();
    }

    @Override
    public void create() {
        System.out.println("creation completed");
    }

    private void initialCreation(){
        System.out.println("creation initialiazed");
    }
}
