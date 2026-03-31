public class StaticKeywordExample {
    public static void main(String[] args) {
        // Static variable
        System.out.println("Static variable:");
        System.out.println("Value of static variable: " + MyClass.staticVariable);

        // Static method
        System.out.println("\nStatic method:");
        MyClass.staticMethod();

        // Static block
        System.out.println("\nStatic block:");
        System.out.println("This will be printed after the static block is executed.");

        // calling static method again to show that static block is executed only once
        MyClass.staticMethod();
        // calling static variable again to show that static block is executed only once
        System.out.println("Value of static variable: " + MyClass.staticVariable);

        // demonstrate super()/this() constructor chaining and display dispatch
        MultipleInheritance mi = new MultipleInheritance(42);
        mi.show();

        // demonstrate method overloading and overriding
        MethodOverloading mo = new MethodOverloading();
        System.out.println("Sum of integers: " + mo.add(5, 10));
        System.out.println("Sum of doubles: " + mo.add(5.5, 10.5));

        MethodOverriding mao = new MethodOverriding();
        mao.display();

        ChildClass cc = new ChildClass();
        cc.display();
        // demonstrate polymorphism
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        System.out.println("\nPolymorphism:");
        myDog.sound(); // calls Dog's sound method
        myCat.sound(); // calls Cat's sound method
        // demonstrate inheritance
        AdvancedCalculator ac = new AdvancedCalculator();
        System.out.println("\nInheritance:");
        System.out.println("Addition: " + ac.add(10, 5));
        System.out.println("Subtraction: " + ac.subtract(10, 5));
        System.out.println("Multiplication: " + ac.multiply(10, 5));
        System.out.println("Division: " + ac.divide(10, 5));
        // demonstrate types of inheritance
        System.out.println("\nTypes of Inheritance:");
        Child child = new Child();
        child.display();
        Child1 child1 = new Child1();
        child1.display();
        Child2 child2 = new Child2();
        child2.display();
        Child3 child3 = new Child3();
        child3.display();
        MultipleInheritance mi2 = new MultipleInheritance();
        mi2.method1();
        mi2.method2();
        mi2.show();
        // demonstrate super and this keyword
        System.out.println("\nSuper and This Keyword:");
        mi2.show();
        A a = new A();
        a.show();
        a.config();
        B b = new B();
        b.show();
        b.config();
        A b2 = new B();
        b2.show();
        b2.config();

    }
}

class MyClass {
    // Static variable
    static int staticVariable = 10;

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Static block
    static {
        System.out.println("This is a static block. It runs when the class is loaded.");
    }
}

// inheritance

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    // subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    // multiply method
    public int multiply(int a, int b) {
        return a * b;
    }

}

class AdvancedCalculator extends Calculator {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}

// Polymorphism
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// types of inheritance
// Single Inheritance
class Parent {
    public void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    public void display() {
        System.out.println("This is the child class.");
    }
}

// Multilevel Inheritance
class GrandParent {
    public void display() {
        System.out.println("This is the grandparent class.");
    }
}

class Parent1 extends GrandParent {
    public void display() {
        System.out.println("This is the parent class.");
    }
}

class Child1 extends Parent1 {
    public void display() {
        System.out.println("This is the child class.");
    }
}

// Hierarchical Inheritance
class Parent2 {
    public void display() {
        System.out.println("This is the parent class.");
    }
}

class Child2 extends Parent2 {
    public void display() {
        System.out.println("This is the child class.");
    }
}

class Child3 extends Parent2 {
    public void display() {
        System.out.println("This is another child class.");
    }
}

// Multiple Inheritance using interfaces
interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

// A parent class to demonstrate super keyword with display()
class DisplayParent {
    public DisplayParent() {
        System.out.println("DisplayParent constructor called.");
    }

    public void display() {
        System.out.println("This is the parent class display method.");
    }
}

class MultipleInheritance extends DisplayParent implements Interface1, Interface2 {
    public MultipleInheritance() {
        super(); // call parent constructor
        System.out.println("MultipleInheritance default constructor called.");
    }

    public MultipleInheritance(int mode) {
        this(); // call current constructor
        System.out.println("MultipleInheritance int constructor called with mode=" + mode);
    }

    public void method1() {
        System.out.println("Method 1 from Interface 1");
    }

    public void method2() {
        System.out.println("Method 2 from Interface 2");
    }

    // this and super keyword
    @Override
    public void display() {
        System.out.println("This is the display method in MultipleInheritance class.");
    }

    public void show() {
        System.out.println("Calling super.display() from MultipleInheritance.show():");
        super.display(); // calling the display method of the parent class
        System.out.println("Calling this.display() from MultipleInheritance.show():");
        this.display(); // calling the display method of the current class
    }
}

// Method Overriding and Overloading
class MethodOverloading {
    // method overloading
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

class MethodOverriding {
    public void display() {
        System.out.println("This is the display method in the parent class.");
    }
}

class ChildClass extends MethodOverriding {
    @Override
    public void display() {
        System.out.println("This is the display method in the child class.");
    }
}

class A {
    public void show() {
        System.out.println("int A");

    }

    public void config() {
        System.out.println("config A");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("int B");

    }

    @Override
    public void config() {
        System.out.println("config B");
    }
}