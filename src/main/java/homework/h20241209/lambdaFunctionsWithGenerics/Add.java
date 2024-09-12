package homework.h20241209.lambdaFunctionsWithGenerics;

@FunctionalInterface
public interface Add<T> {
    T apply(T a, T b);
}
