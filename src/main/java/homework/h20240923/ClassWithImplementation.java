package homework.h20240923;

public class ClassWithImplementation implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Runnable Thread " + i + ": 100");
        }
    }
}
