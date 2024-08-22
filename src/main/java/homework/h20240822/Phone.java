package homework.h20240822;

import java.util.Objects;

public abstract class Phone {
    private static int phonesAmount;
    private int id;
    private int telephoneNumber;
    private Dimensions dimensions;

    private double prize;

    static {
        phonesAmount = 0;
    }

    public Phone() {
        setId();
    }

    public Phone(int telephoneNumber, Dimensions dimensions, double prize) {
        setId();
        this.telephoneNumber = telephoneNumber;
        this.dimensions = dimensions;
        this.prize = prize;
    }

    public Phone(int telephoneNumber, double prize) {
        this(telephoneNumber, new Dimensions(), prize);
    }

    public final int getId() {
        return id;
    }
    public final void setId(){
        this.id = ++phonesAmount;
    }
    public static int getPhonesInstancesAmount(){
        return phonesAmount;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public abstract void start();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone phone)) return false;
        return getId() == phone.getId() && getTelephoneNumber() == phone.getTelephoneNumber() && Double.compare(prize, phone.prize) == 0 && Objects.equals(getDimensions(), phone.getDimensions());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTelephoneNumber(), getDimensions(), prize);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", telephoneNumber=" + telephoneNumber +
                ", prize=" + prize +
                '}';
    }
}
