import java.util.Scanner;

public class A46_SliceNumbers {

    public static void main(String[] args) {
        //DO NOT CHANGE
        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number:");

        int i = input.nextInt();

        int d1 = i / 10000;
        System.out.println(d1);

        int d2 = (i % 10000) / 1000;
        System.out.println(d2);

        int d3 = ((i % 10000) % 1000) / 100;
        System.out.println(d3);

        int d4 = (((i % 10000) % 1000) % 100) / 10;
        System.out.println(d4);

        int d5 = i % 10;
        System.out.println(d5);
    }

}
