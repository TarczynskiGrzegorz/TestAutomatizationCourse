package homework.h20240815;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new MobilePhone(12345678);
        Phone phone2 = new LandlinePhone(600202020);
        phone1.call();
        phone2.call();
        getPhone(2).call();

    }

    public static Phone getPhone(int i) {
        if (i % 2 == 0) {
            return new MobilePhone(12345678);
        } else {
            return new LandlinePhone(600202020);
        }
    }
}
