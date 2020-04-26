package Part1;

import java.util.Scanner;

public class A100_ArraysPrinting01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below:
        for (String each : arr) {
            String str = each.substring(0, 2 + 1);
            System.out.println(str);
        }


    }

}
