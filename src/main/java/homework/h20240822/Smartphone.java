package homework.h20240822;

import homework.h20240822.interfaces.Browserable;

public class Smartphone extends MobilePhone implements Browserable {
    private int memory;
    private Camera cameraFront;

    public Smartphone() {
        super();
    }

    public Smartphone(int telephoneNumber, Dimensions dimensions, double prize, int batteryCapacity, String operatingSystem, Camera cameraBack, int memory, Camera cameraFront) {
        super(telephoneNumber, dimensions, prize, batteryCapacity, operatingSystem, cameraBack);
        this.memory = memory;
        this.cameraFront = cameraFront;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Camera getCameraFront() {
        return cameraFront;
    }

    public void setCameraFront(Camera cameraFront) {
        this.cameraFront = cameraFront;
    }

    @Override
    public void start() {
        System.out.println("Smartphone starts");
    }

    @Override
    public String toString() {
        return "Smartphone";
    }


    @Override
    public void startBrowser() {
        System.out.println("Smartphone starts a browser");
    }

    @Override
    public void sendMessage() {
        System.out.println("Smartphone sends a message");
    }

    @Override
    public void call() {
        System.out.println("Smartphone phone calls");
    }
}
