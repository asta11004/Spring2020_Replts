package Part1;

import java.util.Scanner;

public class A75_WithoutX_x {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String str = "";

        if (word.toLowerCase().startsWith("x") && word.toLowerCase().endsWith("x")) {
            str = word.substring(1, word.length() - 1);
        } else if (word.toLowerCase().startsWith("x")) {
            str = word.substring(1);
        } else if (word.toLowerCase().endsWith("x")) {
            str = word.substring(0, word.length() - 1);
        } else {
            str = word;
        }

        System.out.println(str);
    }

}
