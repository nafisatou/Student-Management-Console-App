public class Course {
    private String name;
    private String code;
    private String description;

    public Course(String name, String code, String description) {
        this.name = name;
        this.code = code;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + " (" + code + "): " + description;
    }
}
