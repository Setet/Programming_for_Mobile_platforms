import java.util.Scanner;

public class Listing_1 {

    public static class Adder {
        private int sum;

        public Adder() {
            sum = 0;
        }

        public Adder(int a) {
            this.sum = a;
        }

        // +
        public void add(int b) {
            sum += b;
        }

        // -
        public void sub(int b) {
            sum -= b;
        }

        // *
        public void mult(int b) {
            sum = sum * b;
        }

        // /
        public void div(int b) {
            sum /= b;
        }

        public int getSum() {
            return sum;
        }
    }

    public static class Calculator {
        public int sum(int... a) {
            Adder adder = new Adder();
            for (int i : a) {
                adder.add(i);
            }
            return adder.getSum();
        }

        // пока не работает
        public int sub(int... a) {
            Adder adder = new Adder();
            for (int i : a) {
                adder.sub(i);
            }
            return adder.getSum();
        }

        public int mult(int... a) {
            Adder adder = new Adder();
            for (int i : a) {
                adder.mult(i);
            }
            return adder.getSum();
        }

        public int div(int... a) {
            Adder adder = new Adder();
            for (int i : a) {
                adder.div(i);
            }
            return adder.getSum();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("operator(+,-,*,/):\n:>");
        String zxc = in.next();
        System.out.print("num_1:\n:>");
        int num_1 = in.nextInt();
        System.out.print("num_2:\n:>");
        int num_2 = in.nextInt();

        Calculator calc = new Calculator();
        switch (zxc) {
            case ("+"):
                System.out.println(num_1 + zxc + num_2 + " = " + calc.sum(num_1, num_2));
                break;
            case ("-"):
                System.out.println(num_1 + zxc + num_2 + " = " + calc.sub(num_1, num_2));
                break;
            case ("*"):
                System.out.println(num_1 + zxc + num_2 + " = " + calc.mult(num_1, num_2));
                break;
            case ("/"):
                System.out.println(num_1 + zxc + num_2 + " = " + calc.div(num_1, num_2));
                break;
        }
    }

}
