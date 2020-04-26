package Part1;

import java.util.Scanner;

public class A115_ArraysFindingMaxlength {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }

        //write your code below

        String result = "";

        for (int i=0; i<words.length; i++) {
            if (result.length() < words[i].length()) {
                result = words[i];
            }
        }

        System.out.println(result);
    }

}
