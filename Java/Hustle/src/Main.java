import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main{
    static String[][] questionBank = {
            {
                    "What is the capital of France?",
                    "A) Paris", "B) London", "C) Rome", "D) Berlin",
                    "A"
            },
            {
                    "Who wrote 'Hamlet'?",
                    "A) Charles Dickens", "B) William Shakespeare", "C) Mark Twain", "D) Leo Tolstoy",
                    "B"
            },
            {
                    "What is 5 + 7?",
                    "A) 10", "B) 12", "C) 14", "D) 15",
                    "B"
            },
            {
                    "Which planet is known as the Red Planet?",
                    "A) Venus", "B) Jupiter", "C) Mars", "D) Saturn",
                    "C"
            },
            {
                    "What is the boiling point of water in Celsius?",
                    "A) 90°C", "B) 95°C", "C) 100°C", "D) 110°C",
                    "C"
            }
    };
    static Random random_number_gen_system = new Random();
    static int random_question_number;
    static String[] random_question;
    static String question;
    static String answer;
    static String[] options;
    static int question_bank_length = questionBank.length;
    static Scanner scanner_user_input;
    static String user_input;
    static int marks = 0;
    static boolean game_running;
    static int questions_asked;

    public static void main(String[] args){
        game();
    }
    static void welcome(){
        System.out.println("************************");
        System.out.println("Welcome to quiz game!");
        System.out.println("************************");
    }
    static void check_user_quit(){
        if (user_input.toLowerCase().equals("quit")){
            System.out.println("Bye dude.");
            game_running=false;
        }
    }
    static String[] question_generator(){
        questions_asked += 1;
        while (true){
            random_question_number = random_number_gen_system.nextInt(0, questionBank.length);

            if (questionBank[random_question_number] != null){
                random_question = questionBank[random_question_number];
                questionBank[random_question_number] = null;
                break;
            }
        }
        return random_question;
        }

    static void option_outputter(){
        options = Arrays.copyOfRange(random_question, 1, 5);

        for (String option : options){
            System.out.print(option+" ");
        }
    }
    static void calculation(){
        question = random_question[0];
        answer = random_question[(random_question.length)-1];
    }
    static void question_printer(){
        question_generator();
        calculation();
        System.out.println(question);
    }
    static void user_input(){
        scanner_user_input = new Scanner(System.in);
        System.out.print("\n\nYour Guess: ");
        user_input = scanner_user_input.nextLine();
    }
    static void check_answer(){
        if (user_input.toLowerCase().equals(answer.toLowerCase())){
            System.out.println("Your are correct!\n");
            marks += 1;
        }
        else{
            System.out.println("Bruh! You are Wrong!\n");
        }
    }
    static void mark_printer(){
        System.out.println("Your mark is, "+marks+"\n");
    }
    static void question_remaining(){
        if (questions_asked == question_bank_length){game_running=false;}
    }
    static void game(){
        welcome();
        game_running = true;
        while (game_running) {
            question_printer();
            option_outputter();
            user_input();
            check_answer();
            question_remaining();
        }
        mark_printer();
    }
}