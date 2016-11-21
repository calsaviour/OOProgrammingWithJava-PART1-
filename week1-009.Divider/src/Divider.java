
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int firstInput, secondInput;
        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number:");
        firstInput = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number:");
        secondInput = Integer.parseInt(reader.nextLine());
        System.out.print("Division: " + firstInput + "/" + secondInput + " = " + ((float) firstInput / secondInput));
    }
}
