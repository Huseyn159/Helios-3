package MentorLessons_3_4.Task3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<String> lengthCheck = a -> a.length()>5;

        System.out.println(lengthCheck.test("Salam"));
        System.out.println(lengthCheck.test("Programmer"));


    }
}
