package Part1;

import java.util.Scanner;

public class A66_MergeThem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

        int length1 = word1.length();
        int length2 = word2.length();

        String result = "";

        if (length1 > 3 || length2 > 3) {
            result = "cannot merge";
        } else {
            result = word1.charAt(0) + "" + word2.charAt(0) + word1.charAt(1) + word2.charAt(1) + word1.charAt(2) + word2.charAt(2);
        }

        System.out.println(result);

    }

}
