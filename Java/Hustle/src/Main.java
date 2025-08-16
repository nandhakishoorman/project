// (0°C × 9/5) + 32 = 32°F
//(32°F − 32) × 5/9 = 0°C

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String current_type;
        double temp;
        double convertion;
        System.out.println("From 'c' to 'f' or 'f' to 'c', what the current type: ");
        current_type = scanner.nextLine();
        System.out.println("Enter the temp: ");
        temp = scanner.nextDouble();
        convertion = (current_type.equalsIgnoreCase("C")) ? (temp* 9.0/5.0) + 32 : (temp - 32) * 5.0/9.0;
        System.out.println(convertion);
    }
}