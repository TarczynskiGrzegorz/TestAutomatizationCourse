package homework.h20240815;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new MobilePhone(12345678, "Xwaf201dd");
        Phone phone2 = new LandlinePhone(600202020, "DArET212a");
        phone1.call();
        phone2.call();
    }
}
