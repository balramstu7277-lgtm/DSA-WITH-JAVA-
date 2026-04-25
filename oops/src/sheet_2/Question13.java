package sheet_2;

class Account {

    private int balance = 0;

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposit successful. Your balance is: " + balance);
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance");
        }
        else {
            balance = balance - amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}

public class Question13 {

    public static void main(String[] args) {

        Account A1 = new Account();

        A1.deposit(1000);
        A1.withdraw(500);
    }
}