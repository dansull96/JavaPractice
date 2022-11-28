
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.valueOf(scanner.nextInt());
        int end = 100;

        while (start <= 100) {
            System.out.println(start);
            start++;
        }

    }
}
