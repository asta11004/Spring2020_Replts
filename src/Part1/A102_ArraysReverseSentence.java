package Part1;

import java.util.Scanner;

public class A102_ArraysReverseSentence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] word=sentence.split(" ");
        for(int i=word.length-1;i>=0;i--){
            System.out.println(word[i]);
        }

    }

}
