
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here

        System.out.println("Password?");
        String user = scan.nextLine();
        String password = "Caput Draconis";

        if (user.equals(password)) {
            System.out.println("Welcome!");
        }   else {
            System.out.println("Off with you!");
        }

    }
}
