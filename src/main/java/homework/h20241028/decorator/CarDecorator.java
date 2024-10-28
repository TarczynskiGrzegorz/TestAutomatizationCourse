package homework.h20241028.decorator;

import homework.h20241028.proxy.CarCreationImplementation;

public class CarDecorator implements CarDecorations {
    private CarDecorations carDecorations;

    public CarDecorator() {
    }

    public CarDecorator(CarDecorations carDecorations) {
        this.carDecorations = carDecorations;
    }

    @Override
    public String decorate() {
        return carDecorations.decorate();
    }
}
