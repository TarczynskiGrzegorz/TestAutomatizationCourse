package homework.h20240815;


import homework.h20240815.mobilePhone.Camera;
import homework.h20240815.mobilePhone.Display;

public class MobilePhone extends Phone{
    private Camera camera;
    private Display display;
    public MobilePhone(int telephoneNumber) {
        super(telephoneNumber);
        super.typeOfCommunication=Communication.WIRELESS;
    }

    @Override
    public void call() {
        System.out.println("Mobile Phone calls");
    }
}
