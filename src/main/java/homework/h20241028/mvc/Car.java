package homework.h20241028.mvc;

public class Car {
    private String name;
    private int prize;

    public Car() {
    }

    public Car(String name, int prize) {
        this.name = name;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }
}
