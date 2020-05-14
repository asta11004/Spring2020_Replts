package Part1;

import java.util.Scanner;

public class A155_Methods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num) {


        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        do {

            num1 = num2;
            num2 = sum;
            sum = num1 + num2;


            num--;

        } while (num > 0);

        System.out.print(sum);

    }

}
