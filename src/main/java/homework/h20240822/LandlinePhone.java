package homework.h20240822;

import homework.h20240822.interfaces.Callable;

import java.util.Objects;

public final class LandlinePhone extends Phone implements Callable {
    private boolean isVeryOld;

    public boolean isVeryOld() {
        return isVeryOld;
    }

    public void setVeryOld(boolean veryOld) {
        isVeryOld = veryOld;
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
