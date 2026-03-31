interface A {
    final static int x = 10; // implicitly public static final

    void methodA();

    void methodB();
}

interface X {
    void run();
}

interface Y extends X {
    void jump();

}

class B implements A, Y {
    public void methodA() {
        System.out.println("Method A implementation in class B.");
    }

    public void methodB() {
        System.out.println("Method B implementation in class B.");
    }

    @Override
    public void run() {
        System.out.println("Run implementation in class B.");
    }

    @Override
    public void jump() {
        System.out.println("Jump implementation in class B.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.methodA();
        obj.methodB();

        Y y = new B();
        y.run();
        y.jump();

        Developer dev = new Developer();
        dev.code();
        Laptop laptop = new Laptop();
        dev.code(laptop);
        // enum usage
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);

    }

}

class Developer {
    public void code() {
        System.out.println("Developer is coding without laptop.");
    }

    public void code(Laptop laptop) {
        System.out.println("Developer is coding.");
        laptop.codedeveloper();
    }
}

class Laptop {
    public void codedeveloper() {
        System.out.println("Laptop is running code.");

    }
}

class Computer {
    public void code() {
        System.out.println("Computer is coding.");
    }
}

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
/*
 * 
 * //enum using if else and switch case
 * class EnumDemo {
 * public static void main(String[] args) {
 * Day today = Day.WEDNESDAY;
 * 
 * // Using if-else
 * if (today == Day.MONDAY) {
 * System.out.println("Today is Monday.");
 * } else if (today == Day.TUESDAY) {
 * System.out.println("Today is Tuesday.");
 * } else if (today == Day.WEDNESDAY) {
 * System.out.println("Today is Wednesday.");
 * } else if (today == Day.THURSDAY) {
 * System.out.println("Today is Thursday.");
 * } else if (today == Day.FRIDAY) {
 * System.out.println("Today is Friday.");
 * } else if (today == Day.SATURDAY) {
 * System.out.println("Today is Saturday.");
 * } else if (today == Day.SUNDAY) {
 * System.out.println("Today is Sunday.");
 * }
 * 
 * // Using switch-case
 * switch (today) {
 * case MONDAY:
 * System.out.println("Today is Monday.");
 * break;
 * case TUESDAY:
 * System.out.println("Today is Tuesday.");
 * break;
 * case WEDNESDAY:
 * System.out.println("Today is Wednesday.");
 * break;
 * case THURSDAY:
 * System.out.println("Today is Thursday.");
 * break;
 * case FRIDAY:
 * System.out.println("Today is Friday.");
 * break;
 * case SATURDAY:
 * System.out.println("Today is Saturday.");
 * break;
 * case SUNDAY:
 * System.out.println("Today is Sunday.");
 * break;
 * }
 * }
 * }
 */