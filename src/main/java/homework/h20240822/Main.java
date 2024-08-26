package homework.h20240822;

import homework.h20240822.exeptions.IllegalDimensionsException;
import homework.h20240822.exeptions.IllegalLandLinePhoneException;
import homework.h20240822.interfaces.Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        // catch exception
        LandlinePhone l1 = new LandlinePhone();
        try {
            l1 = new LandlinePhone(1234567);
            System.out.println("Landline Phone number : " + l1.getTelephoneNumber());
        } catch (IllegalLandLinePhoneException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(l1.getTelephoneNumber());

        // unhandled runtime exception
        Smartphone s3 = new Smartphone();
        s3.setMemory(128);
        System.out.println(s3.getMemory());

        // try catch block
        Dimensions d1 = new Dimensions();
        try {
            d1.setDimmensions(3, -2, 2, 2);
        } catch (IllegalDimensionsException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("insert Phone prize");
        //Scanner - try with resources
        LandlinePhone l2 = new LandlinePhone();
        try (Scanner scanner = new Scanner(System.in)) {
            while (!scanner.hasNextDouble()) {
                scanner.next();
                System.out.println("Not a number ! Insert a proper data");
            }
            double prize = scanner.nextDouble();
            l2.setPrize(prize);

        }
        System.out.println(l2.getPrize());

    }
}
