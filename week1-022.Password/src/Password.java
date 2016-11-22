
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while (true) {
            System.out.print("Type the password: ");
            String answer = reader.nextLine();
            if (password.equals(answer)) {
                System.out.print("Right!");
                System.out.println();
                System.out.print("The secret is: jryy qbar!");
                break;
            }
            System.out.print("Wrong!");
            System.out.println();
        }
    }
}
