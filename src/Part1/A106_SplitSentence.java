package Part1;

import java.util.Scanner;

public class A106_SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below
        String Sntnc[] = sentence.split(" ");

        for (int i=0; i<Sntnc.length ; i++){
            System.out.println(Sntnc[i]);
        }

    }

}