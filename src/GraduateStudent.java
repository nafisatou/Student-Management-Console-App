import java.util.List;

public class GraduateStudent extends Student {
    private String thesisTitle;
    private String advisorName;

    public GraduateStudent(String name, int age, String studentId, 
                           List<Integer> grades, String thesisTitle, String advisorName) {
        super(name, age, studentId, grades);
        this.thesisTitle = thesisTitle;
        this.advisorName = advisorName;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    @Override
    public void displayInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nThesis Title: " + thesisTitle + 
               "\nAdvisor Name: " + advisorName;
    }
}
