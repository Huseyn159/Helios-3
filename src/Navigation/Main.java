package Navigation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose route type:");
        System.out.println("1 - Car");
        System.out.println("2 - Public Transport");
        System.out.println("3 - Walk");
        try {


            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("From where: ");
            String from = sc.nextLine();

            System.out.print("To where: ");
            String to = sc.nextLine();


            Navigator vg = new Navigator();
            vg.calculateRoute(choice, from, to);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong input!");
        }

    }
}
