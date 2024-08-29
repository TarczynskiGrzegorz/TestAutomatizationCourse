package homework.h20240822.collections;

import homework.h20240822.Phone;
import homework.h20240822.Smartphone;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Smartphone(111111111);
        Phone p2 = new Smartphone(111111112);
        Phone p3 = new Smartphone(111111113);

        Queue<Phone> phonesToRepair = PhonesToRepair.getPhonesToRepair();
        phonesToRepair.add(p1);
        phonesToRepair.add(p2);
        phonesToRepair.add(p3);

        // should print the first phone(his telephone number) inserted to que
        System.out.println(phonesToRepair.peek().getTelephoneNumber());





    }
}
