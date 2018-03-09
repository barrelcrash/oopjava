import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();
        
        String reversed = "";
        for (int i = 0; i < name.length(); i++) {
            reversed += name.charAt(name.length() - (1 + i));
        }
        System.out.println("In reverse order: " + reversed);
    }
}
