package MentorLessons_3_1.HomeTasks.Coffee_Shop_Concurrency;

public class CustomerOrder implements Runnable{

    private String customerName;
    private String drink;


    public CustomerOrder(String customerName, String drink) {
        this.drink = drink;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        System.out.println("Customer " + customerName + " ordered " + drink);
        System.out.println("Preparing...");
        try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
        System.out.println("Bon Appetite!Your " + drink + " is ready!");
    }
}
