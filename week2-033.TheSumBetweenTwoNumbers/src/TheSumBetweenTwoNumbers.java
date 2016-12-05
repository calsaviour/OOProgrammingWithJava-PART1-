
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int firstNumber, secondNumber;
        System.out.print("First: ");
        firstNumber = reader.nextInt();
        System.out.print("Last: ");
        secondNumber = reader.nextInt();

        int sum = 0;

        while (firstNumber <= secondNumber) {
            sum += firstNumber;
            firstNumber++;
        }

        System.out.println("The sum " + sum);
    }
}
