import java.util.List;

public class Student extends Person {
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

    public String getStudentId() { return studentId; }
    public List<Integer> getGrades() { return grades; }
    public void setGrades(List<Integer> grades) { this.grades = grades; }

    @Override
    public void displayInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student ID: ").append(studentId)
          .append("\nName: ").append(name)
          .append("\nAge: ").append(age)
          .append("\nGrades: ").append(grades);
        return sb.toString();
    }
}
