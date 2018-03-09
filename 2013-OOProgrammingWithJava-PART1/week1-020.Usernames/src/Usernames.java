
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String username1 = "alex";
        String userpass1 = "mightyducks";
        String username2 = "emily";
        String userpass2 = "cat";
        
        System.out.println("Type your username:");
        String user = reader.nextLine();
        System.out.println("Type your password:");
        String pass = reader.nextLine();
        boolean login;
        
        if (user.equals(username1) && pass.equals(userpass1)
                || user.equals(username2) && pass.equals(userpass2)) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
