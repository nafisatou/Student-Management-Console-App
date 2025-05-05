import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();
        boolean running = true;

        while (running) {
            System.out.println("\n Student Management Console");
            System.out.println("1. Add Student");
            System.out.println("2. Add Graduate Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter ID: ");
                    String id = scanner.next();
                    List<Integer> grades = Arrays.asList(80, 90, 85); // simplified
                    school.addStudent(new Student(name, age, id, grades));
                    break;

                case 2:
                    System.out.print("Enter name: ");
                    String gName = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int gAge = scanner.nextInt();
                    System.out.print("Enter ID: ");
                    String gId = scanner.next();
                    scanner.nextLine(); // clear buffer
                    System.out.print("Enter thesis title: ");
                    String thesis = scanner.nextLine();
                    System.out.print("Enter advisor name: ");
                    String advisor = scanner.nextLine();
                    List<Integer> gGrades = Arrays.asList(88, 92, 75); // simplified
                    school.addStudent(new GraduateStudent(gName, gAge, gId, gGrades, thesis, advisor));
                    break;

                case 3:
                    school.displayAllStudents();
                    break;

                case 4:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}
