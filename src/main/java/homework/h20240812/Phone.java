package homework.h20240812;

import java.awt.*;

public class Phone {
    private double prize;
    private Model model;
    private String color;

    public Phone() {
    }

    public Phone(double prize, Model model, String color) {
        this.prize = prize;
        this.model = model;
        this.color = color;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "\n prize=" + prize +
                "\n color='" + color + '\'' +
                "\n model=" + model.toString() +
                "\n}";
    }
}
