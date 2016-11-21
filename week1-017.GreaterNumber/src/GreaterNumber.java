import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int firstInput, secondInput;
        System.out.print("Type the first number: ");
        firstInput = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        secondInput = Integer.parseInt(reader.nextLine());

        if (firstInput > secondInput) {
            System.out.print("Greater number: " + firstInput);
        } else if (firstInput < secondInput) {
            System.out.print("Greater number: " + secondInput);
        } else {
            System.out.print("The numbers are equal!");
        }
    }
}
