package homework.h20241021;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Order {
    private int id;
    private User user;
    private Car car;
    private Date date;



    public Order() {
    }

    public Order(int id, User user, Car car, Date date) {
        this.id = id;
        this.user = user;
        this.car = car;
        this.date = date;
    }
    @JsonProperty("orderId")
    public int getId() {
        return id;
    }
    @JsonProperty("orderId")
    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", car=" + car +
                ", date=" + date +
                '}';
    }
}
