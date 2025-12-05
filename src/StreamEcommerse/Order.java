package StreamEcommerse;

public class Order {
    private final String name;
    private double price;
    private Status status;

    public Order(String name, double price, Status status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStatus(Status status) {
        this.status = status;
    }




}
