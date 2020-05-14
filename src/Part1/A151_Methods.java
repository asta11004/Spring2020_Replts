package Part1;

import java.util.Scanner;

public class A151_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

        printUniqueNumbers(nums);

    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE
        for (int testNum : nums) {
            int count = 0;
            for (int comp : nums) {
                if (testNum == comp) count++;
                if (count > 1) break;
            }
            if (count == 1) System.out.println(testNum);
        }

    }
}
