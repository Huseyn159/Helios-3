package MentorLessons_3_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day of the week:");

        String input = sc.nextLine();
        try {
        WeekDay day = WeekDay.valueOf(input.toUpperCase());

            switch (day){
                case MONDAY -> System.out.println("Push Day");
                case TUESDAY -> System.out.println("Pull Day");
                case WEDNESDAY -> System.out.println("Leg Day");
                case THURSDAY, SUNDAY -> System.out.println("Rest Day");
                case FRIDAY -> System.out.println("Upper Day");
                case SATURDAY -> System.out.println("Lower Day");
                default -> System.out.println("Error");

            }
        }catch(IllegalArgumentException e){
            System.out.println("Enter valid day");
        }


    }
}
