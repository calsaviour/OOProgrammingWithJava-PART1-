
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = reader.nextInt();
        int sumOfPowers = 0;

        while (number >= 0) {
            sumOfPowers += (int) Math.pow(2, number);
            number--;
        }

        System.out.print("The result is " + sumOfPowers);

    }
}
