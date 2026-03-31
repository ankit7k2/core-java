public class InnerClassExample {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj2 = obj.new B();
        obj2.config();
        A.B.C obj3 = obj2.new C();
        A.D obj4 = new A.D();
        obj4.display();
        // anonymous inner class
        AA obj5 = new AA();
        obj5.display();
        // AA obj6=new BB();
        // obj6.display();
        AA obj6 = new AA() {
            @Override
            public void display() {
                System.out.println("This is the display method in the anonymous inner class.");
            }
        };
        obj6.display();

        AAA obj7 = new AAA() {
            @Override
            public void display() {
                System.out.println("This is the display method in the anonymous inner class extending abstract class.");
            }
        };
        obj7.display();

    }
}

class A {
    int age;

    public void show() {
        System.out.println("int A");

    }

    class B {
        public void config() {
            System.out.println("config B");
        }

        public class C {
        }
    }

    // statc nested class
    static class D {
        public void display() {
            System.out.println("This is the static nested class D.");
        }
    }
}

// anonymous inner class
class AA {
    public void display() {
        System.out.println("This is the display method in class AA.");
    }

    public void show() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }
}

abstract class AAA {
    public abstract void display();
}

// interface
