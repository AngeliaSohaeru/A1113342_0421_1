import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1113342_0421_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your email address: ");
        String email = sc.nextLine();
        sc.close();

        String emailFormat = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailFormat);
        Matcher decider = pattern.matcher(email);
        
        if(decider.matches()){
            System.out.println("Valid email address.");
        }else{
            System.out.println("Invalid email address.");
        }
    }
}