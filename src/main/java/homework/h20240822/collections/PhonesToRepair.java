package homework.h20240822.collections;

import homework.h20240822.Phone;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class PhonesToRepair {
    private static final Queue<Phone> phonesToRepairQue = new LinkedList<>();
    public static Queue<Phone> getPhonesToRepair(){
        return phonesToRepairQue;
    }

}
