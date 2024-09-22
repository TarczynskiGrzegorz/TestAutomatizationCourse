package homework.h20240912.lambdaFunctionsWithGenerics;

@FunctionalInterface
public interface Add<T> {
    T apply(T a, T b);
}
