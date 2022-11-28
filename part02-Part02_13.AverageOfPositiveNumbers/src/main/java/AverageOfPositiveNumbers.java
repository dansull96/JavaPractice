
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        double sum = 0;

        while (true) {
            double num = Double.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }
            if (num > 0) {
                input = input + 1;
                sum = num + sum;
            }
        }

        if (input <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum/input);
        }

    }
}