package homework.h20241028.strategy;

public class OperationSub implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}
