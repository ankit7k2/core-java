
import java.util.ArrayList;
import java.lang.*;

import packages.AdvancedCalculatorExample;
import packages.CalculatorExample;
import packages.*;

public class DemoExample {
    public static void main(String[] args) {
        CalculatorExample obj = new CalculatorExample();
        AdvancedCalculatorExample obj2 = new AdvancedCalculatorExample();
        ArrayList list = new ArrayList();

        // final keyword
        final int x = 10;
        // x = 20; // This will cause a compile-time error because x is final
        System.out.println("Final variable x: " + x);

        Car sedan = new Sedan();
        sedan.start();
        sedan.stop();
        sedan.display();

    }
}

// final keyword
final class A {
    public void display() {
        System.out.println("This is class A.");
    }

    public void add() {
        System.out.println("This is the add method in class A.");
    }
}

class B {
    public void display() {
        System.out.println("This is class B.");
    }

    public void add() {
        System.out.println("This is the add method in class B.");
    }
}

class C extends Object {
    public void display() {
        System.out.println("This is class C.");
    }

    public void add() {
        System.out.println("This is the add method in class C.");
    }
}

// Type casting
class ParentClass {
    public void display() {
        System.out.println("This is the parent class.");
    }
}

class ChildClass extends ParentClass {
    public void display() {
        System.out.println("This is the child class.");
    }
}

// wrapper classes and autoboxing/unboxing
class WrapperExample {
    public static void main(String[] args) {
        // Autoboxing
        Integer intObj = 10; // primitive int is automatically boxed to Integer object
        System.out.println("Autoboxing: " + intObj);

        // Unboxing
        int intValue = intObj; // Integer object is automatically unboxed to primitive int
        System.out.println("Unboxing: " + intValue);

        int num = 5;
        Integer num1 = num; // Autoboxing
        System.out.println(num1); // Autoboxing
        int num2 = num1.intValue(); // Unboxing
        System.out.println(num2);

        String str = "123";
        int num3 = Integer.parseInt(str); // String to int conversion
        System.out.println("String to int: " + num3);
    }
}

// Abstract Keyword

abstract class Car {
    public abstract void start(); // abstract method

    public abstract void stop(); // abstract method

    public void display() {
        System.out.println("This is a car.");
    }
}

class Sedan extends Car {
    @Override
    public void start() {
        System.out.println("Sedan is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Sedan is stopping.");
    }

}
