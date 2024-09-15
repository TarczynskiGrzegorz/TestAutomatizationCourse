package homework.h20240822_20240916;

import homework.h20240822_20240916.exeptions.IllegalMemoryValueException;
import homework.h20240822_20240916.interfaces.Browserable;

public class Smartphone extends MobilePhone implements Browserable {
    private int memory;
    private Camera cameraFront;

    public Smartphone() {
        super();
    }

    public Smartphone(int telephonNumber) {
        super(telephonNumber);
    }



    public Smartphone(int telephoneNumber, Dimensions dimensions, double prize, int batteryCapacity, String operatingSystem, Camera cameraBack, int memory, Camera cameraFront) {
        super(telephoneNumber, dimensions, prize, batteryCapacity, operatingSystem, cameraBack);
        this.memory = memory;
        this.cameraFront = cameraFront;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) throws IllegalMemoryValueException {
        int temp= memory;
        boolean isperfectPowerOf2 = false;
        while (temp%2==0){
            temp=temp/2;
            if(temp==1){
                this.memory = memory;
                isperfectPowerOf2= true;
            }
        }
        if(!isperfectPowerOf2){
            throw new IllegalMemoryValueException("memory should be powered by 2!");

        }

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
