package homework.h20240912.enums;

import java.util.Arrays;

public enum Battery {
    LOW_POWER(15),
    FULL_POWER(100){
        @Override
        public void improve() {
            System.out.println("I reached a full available power");
        }
    };

    static {
        Battery[] values = Battery.values();
        Arrays.stream(values).forEach(v-> System.out.println("power " + v.getPower()+", "+v));
    }


    private int power;

    Battery(int power){
        this.power=power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void improve(){
        this.power++;
    }
}
