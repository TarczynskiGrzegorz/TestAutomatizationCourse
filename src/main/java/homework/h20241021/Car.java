package homework.h20241021;

import com.fasterxml.jackson.annotation.JsonRootName;


public class Car {
    private int prize;
    private Brand brand;

    public Car() {
    }

    public Car(int prize, Brand brand) {
        this.prize = prize;
        this.brand = brand;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "prize=" + prize +
                ", brand=" + brand +
                '}';
    }
}
