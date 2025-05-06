public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayInfo();

    // Optionally add shared logic here (e.g., name/age validation)
}

