import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double principal = 1000;
        double interest_rate = 0.06;  // 6% as decimal
        double no_of_time_compounded = 1; // Compounded once per year
        double time = 5;  // 5 years

        double amount = principal * Math.pow((1 + interest_rate / no_of_time_compounded),
                no_of_time_compounded * time);

        System.out.println("Final Amount after " + time + " years = " + amount);
    }
}
