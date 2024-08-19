package homework.h20240815;


import homework.h20240815.mobilePhone.Camera;
import homework.h20240815.mobilePhone.Display;

import java.time.LocalDate;
import java.util.Objects;

public class MobilePhone extends Phone {
    private Camera camera;
    private Display display;

    public MobilePhone(int telephoneNumber) {
        super(telephoneNumber);
        super.typeOfCommunication = Communication.WIRELESS;
    }


    public MobilePhone(int telephoneNumber, Communication typeOfCommunication, String color, LocalDate productionDate, Integer prize, Integer weight, Camera camera, Display display) {
        super(telephoneNumber, typeOfCommunication, color, productionDate, prize, weight);
        this.camera = camera;
        this.display = display;
    }

    @Override
    public void call() {
        System.out.println("Mobile Phone calls");
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "camera=" + camera.toString() +
                ", display=" + display.toString() +
                ", typeOfCommunication=" + typeOfCommunication +
                ", color='" + color + '\'' +
                ", productionDate=" + productionDate +
                ", prize=" + prize +
                ", weight=" + weight +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MobilePhone p = (MobilePhone) obj;
        // I dont compare displays - so if phones have diffrent displays shoud return true.
        return super.equals(obj)
                && Objects.equals(camera,p.camera);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getTelephoneNumber(), typeOfCommunication, productionDate, prize, weight,camera);
    }
}
