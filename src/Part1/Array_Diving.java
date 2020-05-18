package Part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_Diving {

    public static void main(String[] args) {
        //WRITE YOUR CODES HERE
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            System.out.println("Enter score for judge " + i + ":");
            Integer num = input.nextInt();
            list.add(num);
        }
        System.out.println("Enter difficulty:");
        double difficulty = input.nextDouble();

        list.remove(Collections.min(list));

        list.remove(Collections.max(list));

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double total = sum * difficulty * 0.6;

        // FINAL OUTPUT

        System.out.printf("Total: %.2f", total);
    }

}
