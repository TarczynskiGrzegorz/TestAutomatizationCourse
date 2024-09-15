package homework.h20240822_20240916.exeptions;

public class IllegalMobilePhoneNumberException extends Exception {
    public IllegalMobilePhoneNumberException(String message) {
        super(message);
    }

    public static IllegalMobilePhoneNumberException handleIllegalPhoneNumberException(int errorCode) {
        switch (errorCode) {
            case 1:
                return new IllegalMobilePhoneNumberException("Phone number is to long ");
            case 2:
                return new IllegalMobilePhoneNumberException("Phone number is to short ");
        }
        return new IllegalMobilePhoneNumberException("Phone number is wrong- check data");

    }

}
