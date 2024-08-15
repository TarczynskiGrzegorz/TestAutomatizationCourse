package homework.h20240815;

public class MobilePhone extends Phone{
    public MobilePhone(int telephoneNumber, String serialNumber) {
        super(telephoneNumber, serialNumber);
    }

    @Override
    public void call() {
        System.out.println("Mobile Phone calls");
    }
}
