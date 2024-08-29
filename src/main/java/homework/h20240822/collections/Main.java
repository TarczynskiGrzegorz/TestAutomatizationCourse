package homework.h20240822.collections;

import homework.h20240822.PackageSize;
import homework.h20240822.Phone;
import homework.h20240822.Smartphone;

import java.util.Arrays;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Smartphone(111111111);
        Phone p2 = new Smartphone(111111112);

        Queue<Phone> phonesToRepair = PhonesToRepair.getPhonesToRepair();
        phonesToRepair.add(p1);
        phonesToRepair.add(p2);

        System.out.println("\nQUE TEST");
        // should print the first phone(his telephone number) inserted to que :1111111
        System.out.println(phonesToRepair.peek().getTelephoneNumber());
        PhonesToRepair.repairPhone();
        System.out.println(phonesToRepair.peek().getTelephoneNumber());

        Map<Phone, PackageSize> phonesWithPackage = PhonesWithPackaging.getPhonesWithPackage();
        phonesWithPackage.put(p1,PackageSize.MEDIUM);
        phonesWithPackage.put(p2,PackageSize.SMALL);
        phonesWithPackage.put(p1,PackageSize.LARGE);

        System.out.println("\nMAP TEST");
        for( Map.Entry<Phone, PackageSize> p: phonesWithPackage.entrySet()){
            System.out.println(p.getKey().getTelephoneNumber() + ", package: " + p.getValue());
        }

        System.out.println("\nSET TEST");
        User u1 = new User();
        Set<Phone> phonesU1 = u1.getPhones();
        phonesU1.add(p1);
        phonesU1.add(p2);
        phonesU1.add(p1);
        phonesU1.stream().forEach(v-> System.out.println(v.getTelephoneNumber()));








    }
}
