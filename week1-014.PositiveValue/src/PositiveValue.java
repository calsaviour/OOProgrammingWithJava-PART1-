
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:
        System.out.print("Type a number: ");
        int input;
        input = Integer.parseInt(reader.nextLine());
        if (input > 0) {
            System.out.print("The number is positive");
        } else {
            System.out.print("The number is not positive");
        }
    }
}
