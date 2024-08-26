package homework.h20240822.exeptions;

public class IllegalDimensionsException extends Exception {
    public IllegalDimensionsException(String message) {
        super(message);
    }

    public static IllegalDimensionsException handleIllegaDimmensions(int errorCode) {
        switch (errorCode) {
            case 0:
                return new IllegalDimensionsException("Height is less than 0 ");
            case 1:
                return new IllegalDimensionsException("Length is less than 0 ");
            case 2:
                return new IllegalDimensionsException("Width is less than 0 ");
            case 3:
                return new IllegalDimensionsException("Weight is less than 0 ");
        }
        return new IllegalDimensionsException("Provided dimmensions are wrong- check data");

    }

}
