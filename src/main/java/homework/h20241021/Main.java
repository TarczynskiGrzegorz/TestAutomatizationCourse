package homework.h20241021;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User("Jan Nowak");
        Brand bmw = new Brand("BMW");
        Car car = new Car(10000,bmw);
        Order o1 = new Order(1,user,car, new Date());
        User user2 = new User("Jan Nowak");
        Brand mercedes  = new Brand("Mercedes");
        Car car2= new Car(10000,mercedes);
        Order o2 = new Order(2,user2,car2, new Date());

        List<Order> ordersList = new ArrayList<>();
        ordersList.add(o1);
        ordersList.add(o2);
        Orders orders = new Orders();
        orders.setOrders(ordersList);

        System.out.println(orders.toString());

        ObjectMapper objectMapper = new ObjectMapper();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        objectMapper.setDateFormat(df);

        objectMapper.writeValue(new File("src/main/java/homework/h20241021/orders.json"),orders);

        Orders orders2 = objectMapper.readValue(new File("src/main/java/homework/h20241021/ordersToRead.json"), Orders.class);

        System.out.println("-------------READ-----------");
        System.out.println(orders2.toString());
    }
}
