import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Throws {
    static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Enter a number");
            //    int num = System.in.read();
            //    System.out.println(num-48);

            // InputStreamReader isr = new InputStreamReader(System.in);
            // BufferedReader br = new BufferedReader(isr);
            // String input = br.readLine();
            // int num = Integer.parseInt(input);

            // Scanner sc = new Scanner(System.in);
            // int num = sc.nextInt();
            
            
        try {
            System.out.println("10 / 2 = " + divide(10, 2));
            System.out.println("10 / 0 = " + divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

// try with finally
class TryFinally {
    public static void main(String[] args) {
        try {
            System.out.println("In try block");
            return;
        }catch (Exception e) {
            System.out.println("In catch block");
        } 
        
        
        finally {
            System.out.println("In finally block");
        }

        // try with resources
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } 
    }   
}