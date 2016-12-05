import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = reader.nextInt();
        int factorial = 1;
        while (number > 0) {
            factorial *= number;
            number--;
        }

        System.out.print("Factorial is " + factorial);
    }
}
