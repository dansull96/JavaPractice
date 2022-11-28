
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = 0;
        int numSum = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextInt());

            if (num == 0 ) {
                break;
            }
            if (num > 0 || num < 0) {
                numInput = numInput + 1;
                numSum = num + numSum;
            }
        }
        System.out.println("Number of numbers: " + numInput);
        System.out.println("Sum of the numbers: " + numSum);

    }
}
