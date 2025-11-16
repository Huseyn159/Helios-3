package MentorLessons_3_1.Task3;

public class Main {
    public static void main(String[] args) {
        Knife a = new Knife("Chop Chop");

        Cook c1 = new Cook(a);
        Cook c2 = new Cook(a);
        Cook c3 = new Cook(a);

        c1.start();
        c2.start();
        c3.start();


    }
}
