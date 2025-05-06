import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> students = new ArrayList<>();
        
        // Variable to control the main menu loop
        boolean running = true;

        while (running) {
            System.out.println("\n🔄 Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Export Reports");
            System.out.println("4. Exit");

            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:  // Add student
                    // Collect student information
                    System.out.print("👤 Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.print("🎂 Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    System.out.print("🆔 Enter student ID: ");
                    String studentId = scanner.nextLine();

                    System.out.print("📚 How many grades do you want to enter? ");
                    int numGrades = scanner.nextInt();

                    List<Integer> grades = new ArrayList<>();
                    for (int i = 1; i <= numGrades; i++) {
                        System.out.print("Enter grade " + i + ": ");
                        grades.add(scanner.nextInt());
                    }

                    // Create student object
                    Student student = new Student(name, age, studentId, grades);
                    students.add(student);

                    System.out.println("\nSTUDENT ADDED:");
                    student.displayInfo();  // Display added student info
                    break;

                case 2:  // View all students
                    System.out.println("\n📚 ALL STUDENTS:");
                    if (students.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        for (Person p : students) {
                            p.displayInfo();
                            System.out.println("---------------");
                        }
                    }
                    break;

                case 3:  // Export reports
                    for (Person p : students) {
                        if (p instanceof Reportable) {
                            try {
                                ((Reportable) p).generateReport(p.getClass().getSimpleName() + "_report.txt");
                            } catch (IOException e) {
                                System.out.println(" Error exporting report for student: " + e.getMessage());
                            }
                        }
                    }
                    break;

                case 4:  // Exit program
                    running = false;
                    System.out.println("\n Exiting program.");
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 1-4.");
            }
        }
        scanner.close();
    }
}
