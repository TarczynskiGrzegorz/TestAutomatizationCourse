package homework.h20240822;

import homework.h20240822.interfaces.Callable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Callable> calls = List.of(new MobilePhone(), new Smartphone(), new LandlinePhone());
//
//        calls.stream().forEach(Callable::call);

        //check static methods and fields;
//        Phone p4 = new MobilePhone();
//        Phone p5 = new MobilePhone();
//        Phone p6 = new MobilePhone();
//
//        System.out.println(p6.getId());
//        System.out.println(Phone.getPhonesInstancesAmount());
//
//        Display d1 = new Display();
//        System.out.println(d1.toString());

        //EXCEPTIONS
        //Ovverrided method setTelephonNumber - uses try catch block
        MobilePhone m1 = new MobilePhone(555555555);
        System.out.println(m1.getTelephoneNumber());

        //Use inheritated method from MobilePhone
        Smartphone s1 = new Smartphone(123456789);
        System.out.println(s1.getTelephoneNumber());

        Smartphone s2 = new Smartphone(1234567891);
        System.out.println(s2.getTelephoneNumber());




    }
}
