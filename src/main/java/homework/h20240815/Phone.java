package homework.h20240815;

import java.time.Instant;
import java.util.Objects;

public abstract class Phone {
    private int telephoneNumber;
    private final int hashBean;

    public Phone() {
        this.hashBean = Instant.now().getNano();
    }

    public Phone(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        this.hashBean = Instant.now().getNano();
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
        return Objects.hash(telephoneNumber, hashBean);
    }
}
