package homework.h20241017;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JAXBException, IOException {

        Orders orders = unmarshall();
        System.out.println(orders);
        marshall();
    }
    public static Orders unmarshall() throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Orders.class);
        return (Orders) context.createUnmarshaller()
                .unmarshal(new FileReader("src/main/java/homework/h20241017/orders.xml"));
    }

    public static void marshall() throws JAXBException, IOException {
        Order o1 = new Order(3,"sold", new Car("Audi"),new Date());
        Order o2 = new Order(4,"rent", new Car("Mazda"),new Date());
        Orders orders = new Orders();
        List<Order> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);
        orders.setOrdersList(list);

        JAXBContext context = JAXBContext.newInstance(Orders.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(orders, new File("src/main/java/homework/h20241017/ordersMarshaled.xml"));

    }
}
