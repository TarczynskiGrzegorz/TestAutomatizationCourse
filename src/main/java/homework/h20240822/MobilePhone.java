package homework.h20240822;

import homework.h20240822.exeptions.IllegalMobilePhoneNumberException;
import homework.h20240822.interfaces.Callable;
import homework.h20240822.interfaces.Chargeable;
import homework.h20240822.interfaces.Resetable;
import homework.h20240822.interfaces.Sendable;

import java.util.Objects;

public class MobilePhone extends Phone implements Callable, Resetable, Sendable, Chargeable {
    private int batteryCapacity;
    private String operatingSystem;
    private Camera cameraBack;

    public MobilePhone() {
        super();
    }

    public MobilePhone(int telephonNumber) {
        super();
        setTelephoneNumber(telephonNumber);
    }


    public MobilePhone(int telephoneNumber, Dimensions dimensions, double prize, int batteryCapacity, String operatingSystem, Camera cameraBack) {
        super(telephoneNumber, dimensions, prize);
        this.batteryCapacity = batteryCapacity;
        this.operatingSystem = operatingSystem;
        this.cameraBack = cameraBack;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Camera getCameraBack() {
        return cameraBack;
    }

    public void setCameraBack(Camera cameraBack) {
        this.cameraBack = cameraBack;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        try {
            if (telephoneNumber > 999999999) {
                throw IllegalMobilePhoneNumberException.handleIllegalPhoneNumberException(1);
            }
            if (telephoneNumber < 100000000) {
                throw IllegalMobilePhoneNumberException.handleIllegalPhoneNumberException(2);
            }
            super.setTelephoneNumber(telephoneNumber);
        } catch (IllegalMobilePhoneNumberException e) {
            System.out.println(e.getMessage());

        }
    }

    @Override
    public void start() {
        System.out.println("Mobile phone starts");
    }

    @Override
    public String toString() {
        return "MobilePhone";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePhone that)) return false;
        if (!super.equals(o)) return false;
        return getBatteryCapacity() == that.getBatteryCapacity() && Objects.equals(getOperatingSystem(), that.getOperatingSystem()) && Objects.equals(getCameraBack(), that.getCameraBack());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBatteryCapacity(), getOperatingSystem(), getCameraBack());
    }

    @Override
    public void call() {
        System.out.println("Mobile phone calls");
    }

    @Override
    public void charge() {
        System.out.println("Mobile phone charges battery");
    }

    @Override
    public void sendMessage() {
        System.out.println("Mobile phone sends a message");
    }
}
