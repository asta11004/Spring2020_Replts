package Part1;

import java.util.Scanner;

public class A84_Zombie1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        if (inhabitants > 0) {
            System.out.println("Day 0 [" + inhabitants + "]");
        }

        for (int i = 1; i >= 0; i++) {
            inhabitants /= 2;
            if (inhabitants == 0) {
                System.out.println("---- EXTINCT ----");
                break;
            }
            System.out.println("Day " + i + " [" + inhabitants + "]");

        }

    }

}
