package homework.h20240912.enums;

import java.util.Arrays;

public enum PizzaSize {
    SMALL(10),
    MEDIUM(20),
    BIG(30);

    private int radius;
    static {
        PizzaSize[] values = PizzaSize.values();
        Arrays.stream(values).forEach(v-> System.out.println("radius " + v.getRadius()+", "+v));
    }

    PizzaSize(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
