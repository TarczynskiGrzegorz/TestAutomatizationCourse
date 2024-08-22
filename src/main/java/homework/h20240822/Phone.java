package homework.h20240822;

public abstract class Phone {
    private static int phonesAmount;
    private int id;
    private int telephoneNumber;
    private Dimensions dimensions;

    private double prize;

    static {
        phonesAmount = 0;
    }

    public Phone() {
        setId();
    }

    public Phone(int telephoneNumber, Dimensions dimensions, double prize) {
        setId();
        this.telephoneNumber = telephoneNumber;
        this.dimensions = dimensions;
        this.prize = prize;
    }

    public Phone(int telephoneNumber, double prize) {
        this(telephoneNumber, new Dimensions(), prize);
    }

    public final int getId() {
        return id;
    }
    public final void setId(){
        this.id = ++phonesAmount;
    }
    public static int getPhonesInstancesAmount(){
        return phonesAmount;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
}
