import java.util.Scanner;

// Square returner
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to square: ");
        double number = scanner.nextDouble();

        System.out.println(square_number_method(number));

    }
    static double square_number_method(double square){
        return square * square;
    }
}