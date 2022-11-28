
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int mult = (num * -1);

        if (num < 0) {
            System.out.println(mult);
        } else {
            System.out.println(num);
        }
    }

}
