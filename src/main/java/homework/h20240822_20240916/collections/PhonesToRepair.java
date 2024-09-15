package homework.h20240822_20240916.collections;

import homework.h20240822_20240916.Phone;

import java.util.LinkedList;
import java.util.Queue;

public class PhonesToRepair {
    private static final Queue<Phone> phonesToRepairQue = new LinkedList<>();
    public static Queue<Phone> getPhonesToRepair(){
        return phonesToRepairQue;
    }

    public static void repairPhone() {
        phonesToRepairQue.poll();
        System.out.println("Phone fixed");
    }




}
