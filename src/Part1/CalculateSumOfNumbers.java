package Part1;

import java.util.Scanner;

public class CalculateSumOfNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i2 = 0;

        for (int i = 1; i <= n; i++) {
            i2 += i;
        }

        System.out.println(i2);

    }

}
