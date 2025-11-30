package BankHesabSistemi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bk = new BankAccount(20.0);
        while (true) {
            System.out.println("Current Balance: " + bk.getBalance());
            System.out.print("Enter transaction type (DEPOSIT or WITHDRAWAL) or EXIT to quit: ");
            String inputType = sc.nextLine().toUpperCase();

            if (inputType.equals("EXIT")) {
                System.out.println("Exiting...");
                break;
            }

            TransactionType type;
            try {
                type = TransactionType.valueOf(inputType);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid transaction type! Try again.");
                continue;
            }

            System.out.print("Enter amount: ");
            String amountStr = sc.nextLine();

            try {
                bk.performTransaction(type, amountStr);
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount! Must be a number.");
            }
        }

        sc.close();
    }
}
