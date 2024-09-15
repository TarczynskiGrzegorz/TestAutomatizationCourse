package homework.h20240822_20240916;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class User {
    private String name;
    private List<Phone> phones = new ArrayList<>();
    public User() {
    }


    public User(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public void addPhone(Phone phone){
        phones.add(phone);
    }

    public List<Phone>  getLandlinePhones(){
        return phones.stream()
                .filter(v->v instanceof LandlinePhone)
                .collect(Collectors.toList());
    }

    public List<Phone>  getSmartphones(){
        return phones.stream()
                .filter(v->v instanceof Smartphone)
                .collect(Collectors.toList());
    }

    public void printPhonesNumber(){
        phones.stream().forEach(v-> System.out.println(v.getTelephoneNumber()));
    }

    public double getPrizes(){
       return phones.stream()
                .map(v->v.getPrize())
                .reduce(0.0, Double::sum);
    }
    public double getPrizesOfSmartphones(){
        return phones.stream()
                .filter(v->v instanceof Smartphone)
                .map(v->v.getPrize())
                .reduce(0.0, Double::sum);
    }
    public double getPrizesOfLandlinePhones(){
        return phones.stream()
                .filter(v->v instanceof LandlinePhone)
                .map(v->v.getPrize())
                .reduce(0.0, Double::sum);
    }

    public List<Phone> getPhonesWithoutNumbers(){
        return phones.stream()
                .filter(v->v.getTelephoneNumber()==0)
                .collect(Collectors.toList());
    }



}
