package homework.h20241028.factory;

public class Main {
    public static void main(String[] args) {
        ConcreteCreator concreteCreator = new ConcreteCreator();
        Car car1 = concreteCreator.createCar("BMW");
        Car car2 = concreteCreator.createCar("Mercedes");
        Car car3 = concreteCreator.createCar("X");
        System.out.println(car1.getName());
        System.out.println(car2.getName());
       //nullpoinetrException System.out.println(car3.getName());
    }
}
