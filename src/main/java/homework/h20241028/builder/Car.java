package homework.h20241028.builder;

public class Car {
    private String name;
    private int prize;

    Car(Builder builder){
        this.name= builder.name;
        this.prize= builder.prize;
    }

    public String getName() {
        return name;
    }

    public int getPrize() {
        return prize;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", prize=" + prize +
                '}';
    }

    public static class Builder{
        private String name;
        private int prize;
        public Builder name(String name){
            this.name=name;
            return this;
        }
        public Builder prize(int prize){
            this.prize=prize;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }

}
