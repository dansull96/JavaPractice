
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        int sumOf = first + second;

        int subOf = first - second;

        int multOf = first * second;

        double divOf;
        divOf = (double) first / second;

        System.out.println(first + " + " + second + " = " + sumOf);
        System.out.println(first + " - " + second + " = " + subOf);
        System.out.println(first + " * " + second + " = "+ multOf);
        System.out.println(first + " / " + second + " = " + divOf);


    }
}
