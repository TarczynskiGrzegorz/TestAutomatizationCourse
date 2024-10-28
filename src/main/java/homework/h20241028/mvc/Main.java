package homework.h20241028.mvc;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        CarView carView = new CarView();
        CarController carController = new CarController(car,carView);
        carController.setCarName("Porshe");
        carController.setCarPrize(100);
        carController.updateView();
    }
}
