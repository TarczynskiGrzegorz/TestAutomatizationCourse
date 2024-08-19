package homework.h20240815;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public abstract class Phone {


    private int telephoneNumber;
    protected Communication typeOfCommunication;
    protected String color;
    protected LocalDate productionDate = LocalDate.now();
    protected Integer prize;
    protected Integer weight;

    public Phone() {
    }

    public Phone(int telephoneNumber) {
        this(telephoneNumber, null, null, null, null, null);
    }

    public Phone(int telephoneNumber, Communication typeOfCommunication, String color, LocalDate productionDate, Integer prize, Integer weight) {
        this.telephoneNumber = telephoneNumber;
        this.typeOfCommunication = typeOfCommunication;
        this.color = color;
        this.productionDate = productionDate;
        this.prize = prize;
        this.weight = weight;
    }

    public abstract void call();

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }


    @Override
    public String toString() {
        return "Phone{" +
                ", telephoneNumber=" + telephoneNumber +
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
        Phone p = (Phone) obj;
        return Objects.equals(telephoneNumber, p.getTelephoneNumber())
                && Objects.equals(typeOfCommunication, p.typeOfCommunication)
                && Objects.equals(productionDate, p.productionDate)
                && Objects.equals(prize, p.prize)
                && Objects.equals(weight, p.weight);

    }

    @Override
    public int hashCode() {
        return Objects.hash(telephoneNumber, typeOfCommunication, productionDate, prize, weight);
    }


}
