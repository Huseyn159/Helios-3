package MentorLessons_3_2.StringBuilder.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter something:");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        sb.append(input);

        sb.delete(0,6);
        sb.delete(sb.length()-3,sb.length());
        System.out.println(sb);


    }
}
