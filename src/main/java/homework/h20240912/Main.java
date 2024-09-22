package homework.h20240912;

import homework.h20240912.enums.Battery;
import homework.h20240912.enums.OSSystem;
import homework.h20240912.enums.PizzaSize;
import homework.h20240912.lambdaFunctionsWithGenerics.Add;
import homework.h20240912.lambdaFunctionsWithGenerics.CheckContent;
import homework.h20240912.lambdaFunctionsWithGenerics.PrintMessage;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // ---------------Create 3 functional interfaces- implementation
        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mult = (a, b) -> a * b;
        System.out.println(add.calculate(1, 2));
        System.out.println(sub.calculate(1, 2));

        StringOperation toLowerCase = (a) -> a.toLowerCase() + " ->i'm small";
        StringOperation toUpperCase = (a) -> a.toUpperCase() + " ->I'M BIG";
        System.out.println(toLowerCase.apply("BIGGG ENTRY "));

        ArrayOperation countOccursTypedNumber = (a, b) -> {
            int result = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b) {
                    result++;
                }
            }
            System.out.println("in provided array " + b + " occurs " + result + " times ");
        };
        int[] ex1 = {1, 2, 3, 4, 2, 6};
        countOccursTypedNumber.workOnArray(ex1, 2);

        // ---------------Create 3 custom Lambda functions with generics.
        Add<Integer> add1 = (a, b) -> a + b;
        System.out.println(add1.apply(200, 200));
        Add<String> add2 = (a, b) -> a + b;
        System.out.println(add2.apply("ala ", "cat"));

        PrintMessage<String> printStringInfo = (a) -> a + a.getClass();
        System.out.println(printStringInfo.getMessage("asddsa"));
        PrintMessage<Integer> printIntegerInfo = (a) -> a + " " + a.getClass();
        System.out.println(printIntegerInfo.getMessage(123));

        CheckContent<Integer> cI = (a, b) -> {return a>=b && a<=b;};
        System.out.println(cI.check(2,2));
        System.out.println(cI.check(2,3));
        CheckContent<String> cS = (a, b) -> {return a.contains(b) && b.contains(a);};
        System.out.println(cS.check("lala","ala"));
        System.out.println(cS.check("lala","lala"));

        // ---------------Create 3 complex Enums(with fields, methods, blocks)
        Battery b1 = Battery.FULL_POWER; //from static block should display all valuse from enum
        PizzaSize p1 = PizzaSize.SMALL;
        p1.setRadius(100);
        System.out.println(p1.getRadius()+" "+p1);

        OSSystem os1 = OSSystem.LINUX;
        os1.addToList("mint");
        System.out.println(os1.getTypes());
        // ---------------Use at least 5 lambda functions from the java.util.function package.

        Predicate<Object> isNumber = t -> t instanceof Number;
        Predicate<Object> isString = t -> t instanceof String;
        System.out.println(isNumber.test(123));
        System.out.println(isString.test(123));

//        Function<Double,Double> mathSqrt = v->Math.sqrt(v);
        Function<Double, Double> mathSqrt = Math::sqrt;
        double y = mathSqrt.apply(25.0);
        System.out.println(y);

//      BiFunction<Double,Double,Double> mathPow = (a,b) -> Math.pow(a,b);
        BiFunction<Double, Double, Double> mathPow = Math::pow;
        double x = mathPow.apply(2.0, 2.0);
        System.out.println(x);

        UnaryOperator<Double> mathSqrt2 = Math::sqrt;
        System.out.println(mathSqrt2.apply(9.0));

        Supplier<Integer> getRandom = () -> (int) (Math.random() * 100);
        System.out.println(getRandom.get());
        System.out.println(getRandom.get());


    }

}
