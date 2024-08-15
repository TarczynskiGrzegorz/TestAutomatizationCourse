package homework.h20240815;

public abstract class Phone {
    private int telephoneNumber;
    private String serialNumber;

    public abstract void call();

    public Phone(int telephoneNumber, String serialNumber) {
        this.telephoneNumber = telephoneNumber;
        this.serialNumber = serialNumber;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


}
