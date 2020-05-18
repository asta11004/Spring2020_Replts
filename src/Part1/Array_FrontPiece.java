package Part1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_FrontPiece {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int[] result = new int[2];

        if (num.length >= 2) {
            result[0] = num[0];
            result[1] = num[1];

        }

        System.out.println(Arrays.toString(num));


    }

}
