package homework.h20240822;

import homework.h20240822.interfaces.Callable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Callable> calls = List.of(new MobilePhone(), new Smartphone(), new LandlinePhone());

        calls.stream().forEach(Callable::call);

        //check static methods and fields;
        Phone p4 = new MobilePhone();
        Phone p5 = new MobilePhone();
        Phone p6 = new MobilePhone();

        System.out.println(p6.getId());
        System.out.println(Phone.getPhonesInstancesAmount());

    }
}
