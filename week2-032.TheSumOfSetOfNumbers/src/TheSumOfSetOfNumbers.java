
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int number = reader.nextInt();
        int sum = 0;
        while (number >= 1) {
            sum += number;
            number--;
        }
        System.out.println("Sum is " + sum);

    }
}
