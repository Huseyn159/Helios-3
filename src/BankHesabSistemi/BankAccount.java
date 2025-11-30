package BankHesabSistemi;


public class BankAccount {

    private Double balance;

    public BankAccount(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    private void addBalance(double amount) {
       if (amount<=0){
           System.out.println("Mebleg 0-dan boyuk olmalidir!");
           return;
       }
        balance += amount;
        System.out.println("+" + amount);
        System.out.println("New Balance: " + balance);
    }

    private void deductBalance(double amount) {
        if (amount<=0){
            System.out.println("Mebleg 0-dan boyuk olmalidir!");
            return;
        }
        if (balance < amount) {
            System.out.println("Insufficient Balance");
            return;
        }
        balance -= amount;
        System.out.println("-" + amount);
        System.out.println("New Balance: " + balance);
    }

    public void performTransaction(TransactionType type, String amountStr) {

        double amount = Double.parseDouble(amountStr);

        switch (type) {
            case DEPOSIT -> addBalance(amount);
            case WITHDRAWAL -> deductBalance(amount);
        }
    }
}