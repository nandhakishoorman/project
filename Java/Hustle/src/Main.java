import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day: ");
        String day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                System.out.println("Bruh");
            case "Saturday", "Sunday" ->
                System.out.println("Enjoy! Bruh!");
            default ->{
                System.out.println("That's not in my boss head when he was coding!");
                System.out.println("Jesus is the way, the truth and the life.");
            }
        }
    }
}