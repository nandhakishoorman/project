import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String email;
        int len;
        String the_name;
        email = "nandhakishoorman@gmail.com";
        len = email.length();
        the_name = email.substring(0, 16);
        System.out.println(the_name);
    }
}