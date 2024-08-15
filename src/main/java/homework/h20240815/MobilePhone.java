package homework.h20240815;

public class MobilePhone extends Phone{
    public MobilePhone(int telephoneNumber) {
        super(telephoneNumber);
    }

    @Override
    public void call() {
        System.out.println("Mobile Phone calls");
    }
}
