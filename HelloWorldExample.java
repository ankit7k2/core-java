/*
PS C:\Users\ankit\OneDrive\Desktop\JavaTutorial> jshell
|  Welcome to JShell -- Version 23
|  For an introduction type: /help intro

jshell> 2+3
$1 ==> 5

jshell> 9-6
$2 ==> 3

jshell> print(6);
|  Error:
|  cannot find symbol
|    symbol:   method print(int)
|  print(6);
|  ^---^

jshell> System.out.print(6);
6
jshell> System.out.print("Hello World");
Hello World
jshell>

*
PS C:\Users\ankit\OneDrive\Desktop\JavaTutorial>
 javac Hello.java
PS C:\Users\ankit\OneDrive\Desktop\JavaTutorial>
 java Hello
Hello World
PS C:\Users\ankit\OneDrive\Desktop\JavaTutorial>

*

*/

public class HelloWorldExample {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // arithmetic operators
        int a = 10;
        int b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // increment/decrement operators
        int i = 7;
        System.out.println("i = " + i);
        System.out.println("i++ = " + (i++));
        System.out.println("after i++ i = " + i);
        System.out.println("++i = " + (++i));
        System.out.println("i-- = " + (i--));
        System.out.println("after i-- i = " + i);

        // assignment operators
        int c = 4;
        c += 2; // c = 6
        System.out.println("c after += 2: " + c);
        c *= 3; // c = 18
        System.out.println("c after *= 3: " + c);
        c /= 2; // c = 9
        System.out.println("c after /= 2: " + c);

        // logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // XOR operator (bitwise and logical)
        int p = 6; // 110
        int q = 3; // 011
        System.out.println("p ^ q (bitwise XOR): " + (p ^ q)); // 101 -> 5
        System.out.println("x ^ y (boolean XOR): " + (x ^ y));

        // binary operator (bitwise shift)
        int n = 8; // 1000
        System.out.println("n << 1: " + (n << 1)); // 16
        System.out.println("n >> 1: " + (n >> 1)); // 4

        // type demonstration
        byte by = 127;
        short sh = 558;
        long l = 5854l;
        float f = 5.8F;
        double d = 5.8;
        char ch = 'k';
        boolean bval = true;

        System.out.println("byte: " + by);
        System.out.println("short: " + sh);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + ch);
        System.out.println("boolean: " + bval);
    }
}
