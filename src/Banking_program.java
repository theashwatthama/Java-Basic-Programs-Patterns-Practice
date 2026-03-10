import java.util.Scanner;

public class Banking_program {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // JAVA BANKLING PROGRAM

        double balance = 0;
        boolean isRunning = true;
        int choice;

        System.out.println("**************");
        System.out.println("Welcome to Java Bank");
        System.out.println("**************");
        System.out.println("1 : Show Balance");
        System.out.println("2 : Deposit");
        System.out.println("3 : Withdraw");
        System.out.println("4 : Exit");
        System.out.println("**************");

        System.out.print("Select an option (1-4) :");
        choice = sc.nextInt();

        switch (choice) {
            case 1 -> showBalance(balance);
            case 2 -> showBalance();
            case 3 ->
            case 4 -> isRunning = false;
            default  -> {
                System.out.println("Invalid input please choose either of the choices.");
            }

        }
    }
    static void showBalance(double balance) {
        System.out.printf("Your current balance is : %.2f", balance);
    }
    static void deposit(double balance) {
        double amount;
        System.out.print("Enter the amount to deposit : ");
        amount = sc.nextDouble();
        balance += amount;
        System.out.printf("You have successfully deposited %.2f. Your new balance is : %.2f", amount, balance);
    }
    static void withdraw(double balance) {
        double amount;
        System.out.print("Enter the amount to withdraw : ");
        amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds. Your current balance is : " + balance);
        } else {
            balance -= amount;
            System.out.printf("You have successfully withdrawn %.2f. Your new balance is : %.2f", amount, balance);
        }
    }
}