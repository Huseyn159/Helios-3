package MentorLessons_3_3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Card Type");
try {


        String input = sc.nextLine();

        CardType type = CardType.valueOf(input.toUpperCase());

    type.printCardInfo(type);} catch (IllegalArgumentException e) {
    System.out.println("Error");
}

    }
}
