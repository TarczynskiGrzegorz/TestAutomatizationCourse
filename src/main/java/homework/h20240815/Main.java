package homework.h20240815;

import homework.h20240815.mobilePhone.Camera;
import homework.h20240815.mobilePhone.Display;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Camera camera = new Camera(234);
        camera.setResolutions(List.of(1600, 720));
        Display display = new Display(5, 2340, 1080, 123);

        MobilePhone phone1 = (MobilePhone) getPhone(0);
        phone1.setDisplay(display);
        phone1.setCamera(camera);
        phone1.color = "Black";
        phone1.prize = 1200;
        phone1.weight = 200;
        phone1.productionDate = LocalDate.now();

        System.out.println(phone1.toString());

        LandlinePhone phone2 = (LandlinePhone) getPhone(1);
        phone2.color = "White";
        phone2.prize = 222;
        phone2.weight = 100;
        phone2.productionDate = LocalDate.now();

        System.out.println(phone2.toString());

        Phone phone3 = new MobilePhone(123);
        Phone phone4 = new MobilePhone(123);

        //false - diffrent creation time - compares this field in equals method
        System.out.println(phone3.equals(phone4));



        Phone phone5 = new LandlinePhone(123);
        Phone phone6 = new LandlinePhone(123);

        //true - compares only field "telephonnumber"
        System.out.println(phone5.equals(phone6));


    }

    public static Phone getPhone(int i) {
        if (i % 2 == 0) {
            return new MobilePhone(12345678);
        } else {
            return new LandlinePhone(600202020);
        }
    }
}
