package MentorLessons_3_1.Task1;

public class TablePreparator extends Thread{

    @Override
    public void run() {

        for (int i = 0; i < 7 ; i++) {
            System.out.println("Stekanlar hazirlanir...");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }


}
