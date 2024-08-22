package homework.h20240822;

public class Dimensions {
    protected int height;
    protected int width;
    protected int length;
    protected int weight;

    public Dimensions() {
        height = 0;
        width = 0;
        length = 0;
        weight = 0;
    }

    public Dimensions(int height, int width, int length, int weight) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
