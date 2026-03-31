public class OOPsExample1 {
    public static void main(String[] args) {
        // Encapsulation
        System.out.println("Encapsulation:");
        Person person = new Person("Alice", 30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

    }
}

class Person {
    private String name;
    private int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setAge
    public void setAge(int age) {
        this.age = age;
    }
}
