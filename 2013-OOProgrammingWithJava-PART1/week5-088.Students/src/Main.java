
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        boolean entering = true;
        
        while (entering) {
            System.out.println("name:");
            String name = reader.nextLine();

            if (name.isEmpty()) {
                entering = false;
                break;
            }

            System.out.println("studentnumber:");
            String studentnumber = reader.nextLine();
            list.add(new Student(name, studentnumber));
        }
        
        for (Student student : list) {
            System.out.println(student.toString());
        }
        
        System.out.println("Give search term:");
        String term = reader.nextLine();
        if (!term.isEmpty()) {
            ArrayList<Student> results = new ArrayList<Student>();
            for (Student student : list) {
                if (student.getName().contains(term)) {
                    results.add(student);
                }
            }
            System.out.println("Result:");
            for (Student student : results) {
                System.out.println(student.toString());
            }
        }
        
    }
}