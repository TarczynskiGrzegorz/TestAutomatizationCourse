package homework.h20241028.abstractFactory;

public class BlackCarFactory implements TypeCarFactory{
    @Override
    public VAN makeVan() {
        return new VAN(CarColor.BLACK,"Muniek");
    }

    @Override
    public SEDAN makeSedan() {
        return new SEDAN(CarColor.BLACK, "Wolga");
    }

    Car createCar(CarType type){
        switch (type) {
            case VAN:
                return makeVan();
            case SEDAN:
                return makeSedan();
        }
        return null;
    }
}
