public class CoreJavaDemo {
    public static void main(String[] args) {
        int x = 18;

        // if
        if (x > 10) {
            System.out.println("if: x is greater than 10");
        }

        // if else
        if (x % 2 == 0) {
            System.out.println("if else: x is even");
        } else {
            System.out.println("if else: x is odd");
        }

        // if else ladder
        if (x >= 30) {
            System.out.println("if else ladder: x is 30 or more");
        } else if (x >= 20) {
            System.out.println("if else ladder: x is between 20 and 29");
        } else if (x >= 10) {
            System.out.println("if else ladder: x is between 10 and 19");
        } else {
            System.out.println("if else ladder: x is less than 10");
        }

        // nested if
        if (x > 0) {
            if (x < 20) {
                System.out.println("nested if: x is positive and less than 20");
            }
        }

        // ternary operator
        String size = (x >= 18) ? "adult" : "minor";
        System.out.println("ternary: x is " + size);

        // switch statement
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("switch: Monday");
                break;
            case 2:
                System.out.println("switch: Tuesday");
                break;
            case 3:
                System.out.println("switch: Wednesday");
                break;
            case 4:
                System.out.println("switch: Thursday");
                break;
            case 5:
                System.out.println("switch: Friday");
                break;
            default:
                System.out.println("switch: Weekend");
                break;
        }

        // all loops in java

        // while loop
        int i = 1;
        while (i <= 5) {
            System.out.println("while loop i = " + i);
            i++;
        }

        // do-while loop
        int j = 1;
        do {
            System.out.println("do-while loop j = " + j);
            j++;
        } while (j <= 5);

        // for loop
        for (int k = 1; k <= 5; k++) {
            System.out.println("for loop k = " + k);
        }

        // enhanced for loop (for-each)
        int[] arr = { 10, 20, 30, 40, 50 };
        for (int value : arr) {
            System.out.println("enhanced for: value = " + value);
        }

        // nested while loop
        int outer = 1;
        while (outer <= 3) {
            int inner = 1;
            while (inner <= 3) {
                System.out.println("nested while: outer=" + outer + ", inner=" + inner);
                inner++;
            }
            outer++;
        }

        // nested do-while loop
        int outerDo = 1;
        do {
            int innerDo = 1;
            do {
                System.out.println("nested do-while: outer=" + outerDo + ", inner=" + innerDo);
                innerDo++;
            } while (innerDo <= 3);
            outerDo++;
        } while (outerDo <= 3);

        // nested for loop
        for (int outerFor = 1; outerFor <= 3; outerFor++) {
            for (int innerFor = 1; innerFor <= 3; innerFor++) {
                System.out.println("nested for: outer=" + outerFor + ", inner=" + innerFor);
            }
        }
    }
}
