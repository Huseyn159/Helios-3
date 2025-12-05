package StreamEcommerse;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Order> orders = List.of(

                new Order("Dyson",1299.99,Status.ACTIVE),
                new Order("Iphone",2199.99,Status.ACTIVE),
                new Order("Airpods",399.9,Status.CANCELLED),
                new Order("Mouse",129.99,Status.CANCELLED),
                new Order("Dualsense",99.9,Status.ACTIVE),
                new Order("Playstation",999.99,Status.ACTIVE
        ));


        double sum =  orders.stream()
                .filter(n->n.getStatus() == Status.ACTIVE)
                .mapToDouble(n->n.getPrice()*1.05)
                .sum();


        System.out.println("Total price with tax: " + sum);
    }
}
