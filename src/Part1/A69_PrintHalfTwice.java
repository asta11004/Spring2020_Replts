package Part1;

import java.util.Scanner;

public class A69_PrintHalfTwice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.length()%2!=0){
            word = word.substring(0,word.length()/2) + word.substring(0,word.length()/2);
        }else{
            word = word.substring(0,word.length()/2)+word.substring(0,word.length()/2);
        }

        System.out.println(word);

    }

}
