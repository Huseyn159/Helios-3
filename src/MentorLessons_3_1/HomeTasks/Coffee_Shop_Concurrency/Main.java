package MentorLessons_3_1.HomeTasks.Coffee_Shop_Concurrency;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        CustomerOrder c1 = new CustomerOrder("Ayaz", "Espresso");
        CustomerOrder c2 = new CustomerOrder("Behrem", "Cappuccino");
        CustomerOrder c3 = new CustomerOrder("Ceyhun", "Americano");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);


        t1.start();
        t2.start();
        t3.start();
    }
}