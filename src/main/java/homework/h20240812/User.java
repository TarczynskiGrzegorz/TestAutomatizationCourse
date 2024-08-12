package homework.h20240812;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName = "undefined";
    private List<Phone> phones = new ArrayList<>();

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public void addPhone(Phone phone) {
        this.phones.add(phone);
    }

    public void removePhone(Phone phone) {
        if (phones.contains(phone)) {
            phones.remove(phone);
        } else {
            System.out.println("User doesn't have this phone!");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("user: " + userName + "\nphones: \n");
        for (Phone p : phones) {
            sb.append(p.toString());
        }
        return sb.toString();
    }
}
