package homework.h20240923;

public class Printer {
    public synchronized static void print(){
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
