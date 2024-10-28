package homework.h20241028.abstractFactory;

public class WhiteCarFactory implements TypeCarFactory{
    @Override
    public VAN makeVan() {
        return new VAN(CarColor.WHITE,"Muniek White");
    }

    @Override
    public SEDAN makeSedan() {
        return new SEDAN(CarColor.WHITE, "Wolga White");
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
