package MentorLessons_3_2.StringBuilder.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mesaj yazin");
        String input = sc.nextLine();
        sb.append(input);
        sb.insert(0,"Hörmətli Oxucu, ");

        sb.append(" Hörmətlə, Məktub");
        System.out.println(sb);


    }

}
