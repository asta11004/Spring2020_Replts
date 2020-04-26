package Part1;

import java.util.Scanner;

public class A60_PrintLast {

    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        String last=word.substring(word.length()-1);
        System.out.println(last);
    }

}
