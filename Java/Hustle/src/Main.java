import java.util.Scanner;

// Banking project
public class Main {
    static boolean running = true;
    static int choice;
    static double balance;
    static double deposit_ammount;
    static double withdraw_ammount;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (running) {
            System.out.println("********************");
            System.out.println("Welcome to the bank!");
            System.out.println("********************");
            System.out.println("1. Show Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.println("********************");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> System.out.println(balance_printer());
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> exit_method();
                default -> System.out.println("Bruh that's not fair");
            }
        }
    }

    static void exit_method() {
        running = false;
    }

    static double balance_printer() {
        return balance;
    }

    static void deposit() {
        System.out.print("Enter the ammount to deposit: ");
        deposit_ammount = scanner.nextDouble();
        balance += deposit_ammount;
        System.out.printf("Successfully Deposited $%.2f\n", deposit_ammount);
    }

    static void withdraw() {
        System.out.print("Enter the ammount to withdraw: ");
        withdraw_ammount = scanner.nextDouble();
        if (withdraw_ammount <= balance) {
            balance -= withdraw_ammount;
            System.out.printf("The $%.2f is withdrawn!\n", withdraw_ammount);
        }
        else{
            System.out.printf("Your account contains: $%.2f.\nYou cannot withdraw: $%.2f\n", balance, withdraw_ammount);
        }
    }
}