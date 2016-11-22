
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Map userPassword = new HashMap<String, String>();
        userPassword.put("alex", "mightyducks");
        userPassword.put("emily", "cat");

        System.out.print("Type your username: ");
        String userName = reader.nextLine();
        System.out.print("Type your password: ");
        String password = reader.nextLine();

        if (userPassword.get(userName) != null && userPassword.get(userName).equals(password)) {
            System.out.print("You are now logged into the system!");
        } else {
            System.out.print("Your username or password was invalid!");
        }

    }
}
