package MentorLessons_3_2.String.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type: ");
        String input = sc.nextLine();

        input = input.trim();
        input = input.toUpperCase();

        System.out.println(input);
        System.out.println(input.length());
        System.out.println(input.charAt(input.length()-1));
    }
}
