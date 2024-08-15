package homework.h20240815;

public class LandlinePhone extends Phone {
    public LandlinePhone(int telephoneNumber, String serialNumber) {
        super(telephoneNumber, serialNumber);
    }

    @Override
    public void call() {
        System.out.println("Landline Phone calls");
    }
}
