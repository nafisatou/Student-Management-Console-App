import java.util.List;

public class GraduateStudent extends Student {
    private String thesisTitle;
    private String advisorName;

    public GraduateStudent(String name, int age, String studentId, List<Integer> grades,
                           String thesisTitle, String advisorName) {
        super(name, age, studentId, grades);
        this.thesisTitle = thesisTitle;
        this.advisorName = advisorName;
    }

    @Override
    public void displayInfo() {
        System.out.println(super.toString());
        System.out.println("Thesis: " + thesisTitle + "\nAdvisor: " + advisorName);
    }
}
