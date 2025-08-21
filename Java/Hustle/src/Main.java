import java.util.Scanner;
import java.util.Random;

public class Main{
    static int no_of_dice_to_roll;
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int total;
    static int random_dice_no;

    public static void main(String[] args){
        System.out.println("Welcome to Dice rolling project!");
        dice_roller();
    }
    static void no_of_dice_to_roll(){
        System.out.print("Enter the no of dice to roll: ");
        no_of_dice_to_roll = scanner.nextInt();
    }
    static int no_of_dice_roll(){
        random_dice_no = random.nextInt(1, 7);
        return random_dice_no;
    }
    static void dice_roller(){
        no_of_dice_to_roll();
        int x;
        for (int i = 0; i<no_of_dice_to_roll; i++){
            x = no_of_dice_roll();
            System.out.println(x);
            total += x;
        }
        System.out.println("The total of the dice rolled, "+total);

    }
}