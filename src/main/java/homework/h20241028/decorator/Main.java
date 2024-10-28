package homework.h20241028.decorator;

public class Main {
    public static void main(String[] args) {
        CarDecorations car = new Graffiti(new CarDecorationImpl());
        System.out.println(car.decorate());
    }
}
