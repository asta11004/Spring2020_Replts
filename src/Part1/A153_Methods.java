package Part1;

import java.util.Scanner;

public class A153_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words) {
        //WRITE YOUR CODE HERE
        for (String each2 : words) {

            int count = 0;
            for (String each : words) {
                if (each.equals(each2)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each2);
            }
        }

    }
}
