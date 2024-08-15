package homework.h20240815;

public class LandlinePhone extends Phone {
    public LandlinePhone(int telephoneNumber) {
        super(telephoneNumber);
        super.typeOfCommunication=Communication.WIRE;

    }

    @Override
    public void call() {
        System.out.println("Landline Phone calls");
    }
}
