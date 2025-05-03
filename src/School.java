import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void displayAllStudents() {
        for (Student s : students) {
            s.displayInfo();
            System.out.println();
        }
    }
}
