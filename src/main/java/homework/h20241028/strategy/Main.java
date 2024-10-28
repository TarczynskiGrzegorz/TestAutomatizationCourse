package homework.h20241028.strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("5+5=" + context.executeStrategy(5,5));
        context = new Context(new OperationSub());
        System.out.println("5-5=" + context.executeStrategy(5,5));
    }
}
