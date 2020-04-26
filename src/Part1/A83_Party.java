package Part1;

import java.util.Scanner;

public class A83_Party {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String totalList = " ";

        // your code
        while (true) {
            System.out.println("Please enter guest name:");
            String guestName = input.next();
            totalList += guestName + ", ";

            System.out.println("Do you want to enter new guest name:");
            String answer = input.next();
            if (answer.equals("no")) {
                System.out.println("Guest's list:" + totalList.substring(0, totalList.length() - 2));
                break;
            }

        }


    }

}
