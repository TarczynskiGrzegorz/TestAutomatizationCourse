package homework.h20241028.decorator;

public class Graffiti extends CarDecorator {
    public Graffiti(CarDecorations car) {
        super(car);
    }

    public String decorate() {
        return super.decorate() + decorateWithGraffiti();
    }

    private String decorateWithGraffiti() {
        return " with graffiti";
    }


}
