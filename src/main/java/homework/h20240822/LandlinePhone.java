package homework.h20240822;

import homework.h20240822.exeptions.IllegalLandLinePhoneException;
import homework.h20240822.interfaces.Callable;

import java.util.Objects;

public final class LandlinePhone extends Phone implements Callable {
    private boolean isVeryOld;

    public LandlinePhone() {
        super();
    }

    public LandlinePhone(int telephoneNumber) throws IllegalLandLinePhoneException {
        setTelephoneNumberValidated(telephoneNumber);
    }

    public boolean isVeryOld() {
        return isVeryOld;
    }

    public void setVeryOld(boolean veryOld) {
        isVeryOld = veryOld;
    }

    public void setTelephoneNumberValidated(int telephoneNumber) throws IllegalLandLinePhoneException {
        if (telephoneNumber < 1000000) {
            throw new IllegalLandLinePhoneException("Landline phone number is to short");
        }
        if (telephoneNumber > 9999999) {
            throw new IllegalLandLinePhoneException("Landline phone number is to long");
        }
        setTelephoneNumber(telephoneNumber);

    }


    @Override
    public void start() {
        System.out.println("LandlinePhone starts");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LandlinePhone that)) return false;
        if (!super.equals(o)) return false;
        return isVeryOld() == that.isVeryOld();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isVeryOld());
    }

    @Override
    public void call() {
        System.out.println("Landline phone calls");
    }
}
