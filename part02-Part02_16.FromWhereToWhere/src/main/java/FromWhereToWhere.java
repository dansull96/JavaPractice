
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int end = Integer.valueOf(scanner.nextInt());

        System.out.println("Where from?");
        int start = Integer.valueOf(scanner.nextInt());

        while (end >= start) {
            System.out.println(start);
            start++;
        }
    }
}
