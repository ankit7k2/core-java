package packages;

public class CalculatorExample {
    public static void main(String[] args) {
        // polymorphism
        System.out.println("Polymorphism:");
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animal.sound();
        dog.sound();
        cat.sound();

        // inheritance
        System.out.println("\nInheritance:");
        A a = new A();
        B b = new B();
        C c = new C();
        // dynamic method dispatch
        a.show();
        b.show();
        c.show();
        A a2 = new B();
        a2.show();
        A a3 = new C();
        a3.show();
        a = new C();
        a.show();

    }

}

// dynamic method dispatch
class A {
    public void show() {
        System.out.println("A's show method");
    }
}

class B extends A {
    public void show() {
        System.out.println("B's show method");
    }
}

class C extends A {
    public void show() {
        System.out.println("C's show method");
    }
}
