package MentorLessons_3_2.StringBuilder.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String list = "Çörək Süd Yumurta Pendirdir Bal";


        String[] items = list.split(" ");

        String longest = "";
        StringBuilder sb = new StringBuilder();

        for (String item : items) {
            if (item.length() > longest.length()) {
                longest = item;
            }
        }


        sb.append("Ən uzun məhsul: ").append(longest);

        System.out.println(sb.toString());
    }
}

