package homework.h20241028.builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder().name("BMW").prize(1000).build();
        System.out.println(car);
        Car car2 = new Car.Builder().name("Mercedes").build();
        System.out.println(car2);
    }
}
