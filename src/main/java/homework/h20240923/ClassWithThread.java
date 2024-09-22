package homework.h20240923;

public class ClassWithThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Extended Thread " + i + ": 100");
        }
    }
}
