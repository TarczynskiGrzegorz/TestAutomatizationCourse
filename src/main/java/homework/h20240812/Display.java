package homework.h20240812;

public class Display {
    private int sizeInch;
    private String typeDispaly;
    private int resolution;

    public Display() {

    }

    public Display(int sizeInch, String typeDispaly, int resolution) {
        this.sizeInch = sizeInch;
        this.typeDispaly = typeDispaly;
        this.resolution = resolution;
    }

    public int getSizeInch() {
        return sizeInch;
    }

    public void setSizeInch(short sizeInch) {
        this.sizeInch = sizeInch;
    }

    public String getTypeDispaly() {
        return typeDispaly;
    }

    public void setTypeDispaly(String typeDispaly) {
        this.typeDispaly = typeDispaly;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(short resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "{" +
                "sizeInch=" + sizeInch +
                ", typeDispaly='" + typeDispaly + '\'' +
                ", resolution=" + resolution +
                '}';
    }
}
