// Tertiary operator

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ur marks:- ");
        int score = scanner.nextInt();
        String pass_or_fail = (score >= 60) ? "PASS" : "FAIL";
        System.out.println(pass_or_fail);
    }
}