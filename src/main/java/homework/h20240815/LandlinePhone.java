package homework.h20240815;

import homework.h20240815.landlinePhone.Keyboard;

import java.time.LocalDate;
import java.util.Objects;

public class LandlinePhone extends Phone {
    private Keyboard keyboardType;

    public LandlinePhone(int telephoneNumber) {
        super(telephoneNumber);
        super.typeOfCommunication = Communication.WIRE;
    }

    public LandlinePhone(int telephoneNumber, Communication typeOfCommunication, String color, LocalDate productionDate, Integer prize, Integer weight, Keyboard keyboardType) {
        super(telephoneNumber, typeOfCommunication, color, productionDate, prize, weight);
        this.keyboardType = keyboardType;
    }

    @Override
    public void call() {
        System.out.println("Landline Phone calls");
    }

    public Keyboard getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(Keyboard keyboardType) {
        this.keyboardType = keyboardType;
    }

    @Override
    public String toString() {
        return "LandlinePhone{" +
                "keyboardType=" + keyboardType +
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
        LandlinePhone p = (LandlinePhone) obj;
        return getTelephoneNumber() == p.getTelephoneNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyboardType);
    }
}
