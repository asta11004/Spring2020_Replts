package Part1;

import java.util.Scanner;

public class A148_Method10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();

        next3(num);


    }

    public static void next3(int a) {
        System.out.println((a + 1) + " " + (a + 2) + " " + (a + 3));
    }
}
