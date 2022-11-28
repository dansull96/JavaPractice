
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int input = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextInt());

            if (num == 0) {
                break;
            }
            if (num != 0) {
                sum = num + sum;
                input = input + 1;
            }
        }   double avg = sum/input;
        System.out.println("Average of the numbers: " + avg);

    }
}
