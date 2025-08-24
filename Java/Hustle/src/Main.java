import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Main{
    static String[] options_to_choose = {"rock", "paper", "scissor"};
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static String computer_choice;
    static String user_choice;
    static boolean game_running = true;
    static int user_score;
    static int computer_score;

    public static void main(String[] args){
        // ROCK, PAPER, SCISSORS game
        game();
        scanner.close();

    }
    static void game(){
        while (game_running){
            user_choice();
            computer_choice();
            check_winner();
            still_playing();
        }
    }
    static void computer_choice(){
        int random_index = random.nextInt(0, options_to_choose.length);
        computer_choice = options_to_choose[random_index];
        System.out.println("Computer choice: "+computer_choice);
    }
    static void user_choice(){
        System.out.print("Enter your option: (rock, paper, scissor) ");
        user_choice = scanner.nextLine();
    }
    static void check_winner(){
        if (Objects.equals(computer_choice, user_choice)){
            System.out.println("It's a draw!");

        } else if (Objects.equals(computer_choice, "rock") && Objects.equals(user_choice, "scissor")){//computer winning strategy
            System.out.println("Computer Won!");
            computer_score += 1;

        } else if (Objects.equals(computer_choice, "scissor") && Objects.equals(user_choice, "paper")) {
            System.out.println("Computer Won!");
            computer_score += 1;

        } else if (Objects.equals(computer_choice, "paper") && Objects.equals(user_choice, "rock")) {
            System.out.println("Computer Won!");
            computer_score += 1;

        } else if (Objects.equals(computer_choice, "rock") && Objects.equals(user_choice, "paper")) {//User winning strategy
            System.out.println("User Won!");
            user_score += 1;

        } else if (Objects.equals(computer_choice, "paper") && Objects.equals(user_choice, "scissor")) {
            System.out.println("User Won!");
            user_score += 1;

        } else if (Objects.equals(computer_choice, "scissor") && Objects.equals(user_choice, "rock")) {
            System.out.println("User Won!");
            user_score += 1;

        }
    }
    static void still_playing(){
        System.out.print("Are you willing to play: ");
        String will_play_or_no = scanner.nextLine();
        if (Objects.equals(will_play_or_no.toLowerCase(), "no")){
            game_running=false;
            System.out.println("User mark: "+user_score);
            System.out.println("Computer mark: "+computer_score);
            if (user_score == computer_score){
                System.out.println("Both are the winner");
            } else if (user_score < computer_score) {
                System.out.println("Computer is the overall winner!");
            } else{
                System.out.println("User is the overall winner");
            }
        }
    }
}