
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        if (0 <= points && points <= 29) {
            result("failed");
        } else if (30 <= points && points <= 34) {
            result("1");
        } else if (35 <= points && points <= 39) {
            result("2");
        } else if (40 <= points && points <= 44) {
            result("3");
        } else if (45 <= points && points <= 49) {
            result("4");
        } else if (50 <= points && points <= 60) {
            result("5");
        }
    }

    private static void result(String result) {
        System.out.print("Grade" + result);
    }
}
