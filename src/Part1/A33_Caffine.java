package Part1;

import java.util.Scanner;

public class A33_Caffine {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int caffeineInDrink= input.nextInt();
        int drinksToKill = 10*1000/caffeineInDrink;

        System.out.println("It would take about " + drinksToKill+" drinks for a lethal overdose.");

    }
}
