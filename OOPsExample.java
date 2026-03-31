class Calculator {
    int a;

    public int add(int n1, int n2) {
        int res = n1 + n2;
        System.out.println("in add");
        return res;
    }

    public int add(int n1, int n2, int n3) {
        int res = n1 + n2 + n3;
        System.out.println("in add with 3 parameters");
        return res;
    }

    public double add(double n1, int n2) {
        double res = n1 + n2;
        System.out.println("in add with double and int");
        return res;
    }
}

public class OOPsExample {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        Calculator calc = new Calculator();
        int rs = calc.add(num1, num2);
        System.out.println(rs);

        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMePen(rs);
        System.out.println(str);
    }
}

// object oriented programming
// object --- properties behavier
// class

class Computer {
    public void playMusic() {
        System.out.println("Music Playing       ");

    }

    public String getMePen(int cost) {
        if (cost >= 10) {

            return "Pen";
        } else {
            return "Nothing";
        }
    }
}
