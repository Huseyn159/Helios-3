package MentorLessons_3_1.HomeTasks.Coffee_Shop_TeamWork;

public class CoffeeShotPreparation extends  Thread {

    @Override
    public void run() {
        System.out.println("Espresso shot hazirlanir...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Espresso Shot hazirdir.");
    }
}
