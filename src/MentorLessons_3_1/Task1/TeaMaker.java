package MentorLessons_3_1.Task1;

public class TeaMaker extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Cay demlenir...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException("Error " +e);
            }
        }

    }
}
