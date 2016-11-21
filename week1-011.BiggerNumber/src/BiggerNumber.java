
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int firstInput, secondInput;
        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number: ");
        firstInput = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        secondInput = Integer.parseInt(reader.nextLine());

        int biggerNumber;
        if (firstInput > secondInput) {
            biggerNumber = firstInput;
        } else {
            biggerNumber = secondInput;
        }

        System.out.print("The bigger number of the two numbers given was: " + biggerNumber);

    }
}
