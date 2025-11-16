package MentorLessons_3_1.HomeTasks.Coffee_Shop_TeamWork;

public class CupPreparation extends  Thread {

    @Override
    public void run() {
        System.out.println("Fincan ve sous hazirlanir...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Fincan ve sous hazirdir.");
    }
}
