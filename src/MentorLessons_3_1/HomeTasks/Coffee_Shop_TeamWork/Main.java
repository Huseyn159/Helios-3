package MentorLessons_3_1.HomeTasks.Coffee_Shop_TeamWork;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MilkPreparation l1 = new MilkPreparation();
        CoffeeShotPreparation l2 = new CoffeeShotPreparation();
        CupPreparation l3 = new CupPreparation();


        l1.start();
        l2.start();
        l3.start();
        l1.join();
        l2.join();
        l3.join();
        System.out.println("Latte hazirdir!!!");


    }
}
