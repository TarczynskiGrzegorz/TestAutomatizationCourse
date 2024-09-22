package homework.h20240923;


import java.util.concurrent.Callable;

public class ClassWithCall implements Callable<Integer> {

    @Override
    public Integer call() {
        return 7;
    }
}
