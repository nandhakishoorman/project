import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main{
    static int current_balance = 100;
    static Scanner scanner = new Scanner(System.in);
    static int user_bet_ammount;
    static String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐️"};
    static Random random = new Random();
    static String rand_1, rand_2, rand_3;
    static int rand_1_index, rand_2_index, rand_3_index;
    static boolean game_running = true;


    public static void main(String[] args){
        game();
    }
    static void game(){
        while(game_running) {
            welcome_msg();
            user_bet();
            spinner();
            check_winning();
            play_again();
        }
        scanner.close();
    }
    static void welcome_msg(){
        System.out.println("************************");
        System.out.println("Welcome to Java slot program!");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐️");
        System.out.println("************************");
        System.out.println("Your current balance: "+current_balance);
    }
    static void user_bet(){
        while (true){
            System.out.print("Enter your bet: ");
            user_bet_ammount = scanner.nextInt();

            if (user_bet_ammount <= current_balance){
                current_balance -= user_bet_ammount;
                break;
            }
            else{
                System.out.println("You cannot bet "+user_bet_ammount+" as your balance is "+current_balance);
            }
        }
    }
    static void spinner(){
        System.out.println("Spinning...");
        System.out.println("******************");

        rand_1_index = random.nextInt(0, symbols.length);
        rand_2_index = random.nextInt(0, symbols.length);
        rand_3_index = random.nextInt(0, symbols.length);

        rand_1 = symbols[rand_1_index];
        rand_2 = symbols[rand_2_index];
        rand_3 = symbols[rand_3_index];

        System.out.println(rand_1 + " | "+ rand_2 + " | "+ rand_3);
    }
    static void check_winning(){
        if (Objects.equals(rand_1, rand_2) && Objects.equals(rand_2, rand_3)){
            current_balance += user_bet_ammount + (user_bet_ammount*2);
            System.out.println("You won "+(user_bet_ammount + (user_bet_ammount * 2)));

        } else if (Objects.equals(rand_1, rand_2)) {
            current_balance += user_bet_ammount + (user_bet_ammount*2);
            System.out.println("You won "+(user_bet_ammount + (user_bet_ammount * 2)));


        } else if (Objects.equals(rand_2, rand_3)) {
            current_balance += user_bet_ammount + (user_bet_ammount*2);
            System.out.println("You won "+(user_bet_ammount + (user_bet_ammount * 2)));

        }
    }
    static void play_again(){
        System.out.print("Do you want to play again: ");
        game_running = scanner.nextBoolean();
        if (Objects.equals(game_running, false)){
            System.out.println("This is your total balance: "+current_balance);
            if (current_balance < 100){
                System.out.println("You lost: "+(100-current_balance));
            }
            else{
                System.out.println("You won: "+(current_balance - 100));
            }
        }
    }
}