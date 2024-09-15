package homework.h20240822_20240916.collections;

import homework.h20240822_20240916.Phone;

import java.util.*;

public class User {

    private static final Set<String> usersNamesSorted = new TreeSet<>() ;
    public static Set<String> getUsersDinstinctNnames(){
        return usersNamesSorted;
    }

    private final Set<Phone> phones = new HashSet<>();
    private final List<String> historyTelephoneNumbers = new ArrayList<>();
    private String userName;


    public User(String userName) {
        this.userName = userName;
        usersNamesSorted.add(userName);
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Set<Phone> getPhones() {
        return phones;
    }

    public List<String> getHistoryTelephoneNumbers() {
        return historyTelephoneNumbers;
    }
}
