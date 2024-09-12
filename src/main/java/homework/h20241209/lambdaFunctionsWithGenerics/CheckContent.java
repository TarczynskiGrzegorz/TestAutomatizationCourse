package homework.h20241209.lambdaFunctionsWithGenerics;
@FunctionalInterface
public interface CheckContent<T> {
    boolean check(T o1, T o2);
}
