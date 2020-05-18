package Part1;

class LameCalculator {
    public int plus(int x, int y) {
        return x + y;
    }

    public int minus(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        return x / y;
    }

}

public class A193_OOP2 {

    public static void main(String[] args) {

        LameCalculator lc = new LameCalculator();
        System.out.println("1+1 = " + lc.plus(1, 1));
        System.out.println("2-3 = " + lc.minus(2, 3));
        System.out.println("2x3 = " + lc.multiply(2, 3));
        System.out.println("10:2 = " + lc.divide(10, 2));


    }

}
