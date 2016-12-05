
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        int firstNumber;
        int secondNumber;

        System.out.println("First: ");
        firstNumber = reader.nextInt();
        System.out.println();
        System.out.println("Last: ");
        secondNumber = reader.nextInt();

        while (firstNumber <= secondNumber) {
            System.out.println(firstNumber);
            firstNumber++;
        }

    }
}
