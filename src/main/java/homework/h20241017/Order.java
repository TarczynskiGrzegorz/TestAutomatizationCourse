package homework.h20241017;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.Date;

@XmlType(propOrder = {"car", "name", "date"})
public class Order {
    private int id;
    private String name;
    private Car car;
    private Date date;

    public Order() {
    }

    public Order(int id, String name, Car car, Date date) {
        this.id = id;
        this.name = name;
        this.car = car;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }
    @XmlElement
    public void setCar(Car car) {
        this.car = car;
    }

    public Date getDate() {
        return date;
    }
    @XmlJavaTypeAdapter(DateAdapter.class)
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", car=" + car +
                ", date=" + date +
                '}';
    }
}
