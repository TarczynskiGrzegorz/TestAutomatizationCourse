package homework.h20240815;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public abstract class Phone {
    private final int HASH_BEAN;
    private int telephoneNumber;
    protected Communication typeOfCommunication;
    protected String color;
    protected LocalDate productionDate = LocalDate.now();
    protected int prize;
    protected int weight;

    public Phone() {
        this.HASH_BEAN = Instant.now().getNano();
    }

    public Phone(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        this.HASH_BEAN = Instant.now().getNano();
    }

    public abstract void call();

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }


    @Override
    public int hashCode() {
        return Objects.hash(telephoneNumber, HASH_BEAN);
    }
}
