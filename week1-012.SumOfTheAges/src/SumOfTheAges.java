
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        String firstName;
        int firstAge;
        firstName = readName(reader);
        firstAge = readAge(reader);

        String secondName;
        int secondAge;
        secondName = readName(reader);
        secondAge = readAge(reader);

        StringBuilder sb = new StringBuilder();
        sb.append(firstName);
        sb.append(" and ");
        sb.append(secondName);
        sb.append(" are ");
        sb.append(firstAge + secondAge);
        sb.append(" years old in total.");
        System.out.print(sb);
    }


    private static String readName(Scanner reader) {
        System.out.print("Type your name: ");
        return reader.nextLine();
    }

    private static int readAge(Scanner reader) {
        System.out.print("Type your age: ");
        return Integer.parseInt(reader.nextLine());
    }
}
