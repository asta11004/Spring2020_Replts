package Part1;

import java.util.Scanner;

public class A34_VideoGames {

    public static void main(String[] args) {

        //Write your code here
        System.out.println("Enter number of coupons:");
        Scanner input = new Scanner(System.in);
        int coupon = input.nextInt();

        if (coupon >= 3) {

            System.out.println("Number of Candies: " + (coupon / 10));
            System.out.println("Number of Gumballs: " + (coupon % 10) / 3);
        }

        else{
            System.out.println("Not enough coupons");
        }

    }

}
