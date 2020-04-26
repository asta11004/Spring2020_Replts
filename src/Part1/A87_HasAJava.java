package Part1;

import java.util.Scanner;

public class A87_HasAJava {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.indexOf("java") == 0 || word.indexOf("java") == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
