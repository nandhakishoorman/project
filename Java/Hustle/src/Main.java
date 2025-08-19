public class Main{
    public static void main(String[] args){
        System.out.println("Hello");
        int i = 10;
        while (i!=10-9){
            System.out.println("You are in a infinite loop!");
            i=i-1;//i--
        }
    }
}