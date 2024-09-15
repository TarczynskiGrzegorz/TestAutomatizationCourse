package homework.h20240822_20240916.collections;

import homework.h20240822_20240916.PackageSize;
import homework.h20240822_20240916.Phone;
import homework.h20240822_20240916.Smartphone;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Smartphone(111111111);
        Phone p2 = new Smartphone(111111112);

        System.out.println("\nQUE TEST");
        Queue<Phone> phonesToRepair = PhonesToRepair.getPhonesToRepair();
        phonesToRepair.add(p1);
        phonesToRepair.add(p2);

        // should print the first phone(his telephone number) inserted to que :1111111
        System.out.println(phonesToRepair.peek().getTelephoneNumber());
        PhonesToRepair.repairPhone();
        System.out.println(phonesToRepair.peek().getTelephoneNumber());

        System.out.println("\nMAP TEST");
        Map<Phone, PackageSize> phonesWithPackage = PhonesWithPackaging.getPhonesWithPackage();
        phonesWithPackage.put(p1, PackageSize.MEDIUM);
        phonesWithPackage.put(p2, PackageSize.SMALL);
        phonesWithPackage.put(p1, PackageSize.LARGE);

        for (Map.Entry<Phone, PackageSize> p : phonesWithPackage.entrySet()) {
            System.out.println(p.getKey().getTelephoneNumber() + ", package: " + p.getValue());
        }

        System.out.println("\nSET TEST");
        User u1 = new User("Max");
        Set<Phone> phonesU1 = u1.getPhones();
        phonesU1.add(p1);
        phonesU1.add(p2);
        phonesU1.add(p1);
        phonesU1.stream().forEach(v -> System.out.println(v.getTelephoneNumber()));


        System.out.println("\nLIST TEST");
        List<String> historyPhoneNumbersU1 = u1.getHistoryTelephoneNumbers();
        historyPhoneNumbersU1.add(String.valueOf(p1.getTelephoneNumber()));
        historyPhoneNumbersU1.add(String.valueOf(p2.getTelephoneNumber()));
        historyPhoneNumbersU1.add(String.valueOf(p1.getTelephoneNumber()));
        historyPhoneNumbersU1.add(String.valueOf(p1.getTelephoneNumber()));
        historyPhoneNumbersU1.stream().forEach(System.out::println);

        System.out.println("\nSORTED SET TEST");
        User u2 = new User("Ivan");
        User u3 = new User("Bono");
        User u4 = new User("Alex");
        User.getUsersDinstinctNnames().add("Bono");
        User.getUsersDinstinctNnames().forEach(v -> System.out.println(v));


    }
}
