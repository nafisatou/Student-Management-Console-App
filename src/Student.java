import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

// Student class inherits from Person and implements Reportable
public class Student extends Person implements Reportable {
    private String studentId;
    private List<Integer> grades;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public Student(String name, int age, String studentId, List<Integer> grades) {
        this(name, age, studentId);
        this.grades = grades;
    }

    public String getStudentId() {
        return studentId;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public double calculateGPA() {
        if (grades == null || grades.isEmpty()) return 0.0;
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }

    @Override
    public void generateReport(String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.println(this.toString());
            System.out.println("✅ Student report exported to: " + filename);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Student ID: ").append(studentId)
                .append("\nName: ").append(name)
                .append("\nAge: ").append(age)
                .append("\nGrades: ").append(grades)
                .append("\nGPA: ").append(String.format("%.2f", calculateGPA()))
                .toString();
    }
}
