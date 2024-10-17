package homework.h20241017;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "orders")
public class Orders {
    private List<Order> ordersList;

    public List<Order> getOrdersList() {
        return ordersList;
    }

    @XmlElement(name = "order")
    public void setOrdersList(List<Order> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "ordersList=" + ordersList +
                '}';
    }
}
