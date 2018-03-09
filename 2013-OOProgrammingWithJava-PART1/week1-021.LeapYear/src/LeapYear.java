
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a year:");
        int year = Integer.parseInt(reader.nextLine());
        boolean byFour = year % 4 == 0;
        boolean byCent = year % 100 != 0 || year % 400 == 0;
        
        if (byFour && byCent){ 
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
