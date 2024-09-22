package homework.h20240912.lambdaFunctionsWithGenerics;
@FunctionalInterface
public interface CheckContent<T> {
    boolean check(T o1, T o2);
}
