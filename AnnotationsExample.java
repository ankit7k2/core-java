public class AnnotationsExample {
    public static void main(String[] args) {
        // final variable
        final int x = 10;
        System.out.println(x);
        B obj = new B();
        obj.display();
        obj.displayanditbelongtothisclass();
        obj.add();

        FunctionalExample functional = () -> System.out.println("Functional interface executed.");
        functional.perform();

        MarkerClass markerObj = new MarkerClass();
        System.out.println("markerObj instanceof MarkerInterface: " + (markerObj instanceof MarkerInterface));
        Aa obj22 = (i, j) -> i + j;
        int res = obj22.show(10, 38);
        System.out.println(res + " This is the show method in the anonymous class implementing Aa.");

    }

}

interface A {
    void display();

    void displayanditbelongtothisclass();

    void add();
}

class B implements A {
    @Override
    public void display() {
        System.out.println("This is class B.");
    }

    @Override
    public void displayanditbelongtothisclass() {
        System.out.println("This is class B.");
    }

    @Override
    public void add() {
        System.out.println("This is the add method in class B.");
    }
}

@FunctionalInterface
interface FunctionalExample {
    void perform();
}

interface MarkerInterface {
}

class MarkerClass implements MarkerInterface {
}
// normal interface

// @FunctionalInterface

// @marker interface

@FunctionalInterface
interface Aa {
    int show(int i, int j);

}
// class Bbb implements Aa{
// @Override
// public void show() {
// System.out.println("This is the show method in class Bbb.");

// }
// }