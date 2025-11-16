package MentorLessons_3_1.Task2;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        Withdraw w1 = new Withdraw();
        Withdraw w2 = new Withdraw();
        Withdraw w3 = new Withdraw();


        w1.start();
        w1.join();
        w2.start();
        w2.join();
        w3.start();
        w3.join();




    }
}
