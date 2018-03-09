import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number:");
        int until = Integer.parseInt(reader.nextLine());
        int fact = 0;
        int count = 1;
        
        while (count <= until) {
            if (fact == 0) {
                fact = count;
            } else {
                fact *= count;
                count++;
            }
        }
        
        System.out.println("Factorial is" + fact);
    }
}
