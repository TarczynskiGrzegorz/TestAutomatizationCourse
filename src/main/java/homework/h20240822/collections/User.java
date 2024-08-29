package homework.h20240822.collections;

import homework.h20240822.Phone;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String userName;
    private final Set<Phone> phones = new HashSet<>();


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Set<Phone> getPhones() {
        return phones;
    }

}
