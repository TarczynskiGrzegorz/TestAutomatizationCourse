package homework.h20240923;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ClassWithThread classWithThread = new ClassWithThread();
        classWithThread.start();

        Thread implementedThread = new Thread(new ClassWithImplementation());
        implementedThread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(("Main Thread " + i + ": 100"));
        }

        Printer.print();


        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Integer> future = executorService.submit(new ClassWithCall());

        try {
            System.out.println(future.get());
        } catch (Exception e) {
            System.out.println("Can't get value from Thread");
        }
    }
}
