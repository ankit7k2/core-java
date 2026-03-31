import java.util.ArrayList;
import java.util.List;

class Methodreferance {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        // // Using method reference to print each name
        // List<String>uNamList= names.stream()
        // .map(String::toUpperCase) // Convert each name to uppercase using method
        // reference
        // .toList();

        // System.out.println(uNamList);

        List<Student> student = new ArrayList<>();
        List<Student> students = names.stream().map(Student::new).toList();

        students.forEach(System.out::println); // Using method reference to print each student

    }

}

class Student {
    private String name;
    private int marks;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', marks=" + marks + "}";
    }
}