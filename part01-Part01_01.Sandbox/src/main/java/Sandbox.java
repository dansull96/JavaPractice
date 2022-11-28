import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());

        int even = number % 2;

        boolean isItOdd = (even == 1);

        if (isItOdd == true) {
            System.out.println("Number " + number + " is odd.");
        }   else {
            System.out.println("Number " + number + " is even.");
        }





    }
}
