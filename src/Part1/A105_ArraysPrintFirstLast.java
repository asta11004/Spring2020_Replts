package Part1;

import java.util.Arrays;
import java.util.Scanner;

public class A105_ArraysPrintFirstLast {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        for (int i = 0; i < words.length; i++) {
            words[i] = "" + words[i].charAt(0) + words[i].charAt(words[i].length() - 1);
        }

        System.out.print(Arrays.toString(words));

    }

}
