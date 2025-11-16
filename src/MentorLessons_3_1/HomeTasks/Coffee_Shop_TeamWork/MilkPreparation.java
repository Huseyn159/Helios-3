package MentorLessons_3_1.HomeTasks.Coffee_Shop_TeamWork;

public class MilkPreparation extends  Thread {


    @Override
    public void run() {
        System.out.println("Sud kopurdulur...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Sud kopurdu.");

    }
}
