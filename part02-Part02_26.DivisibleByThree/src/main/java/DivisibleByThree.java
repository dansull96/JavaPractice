
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        divisibleByThreeInRange(3, 12);
    }
    public static void divisibleByThreeInRange(int beginning, int end){
        for (int number = beginning; number <= end; number++) {
            if (number % 3 == 0) {
                System.out.println(number);
                number++;
            }
        }
    }
}
