package Part1;

import java.util.Scanner;

public class BurgerOrChicken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in = scan.next();

        //your code here
        float burger = 10.0f;
        float chicken = 10.0f;
        float soda = 2.0f;

        if (in.equals("burger") || in.equals("chicken")) {
            System.out.println(10.0);
        }

        if (in.equals("soda")) {
            System.out.println(2.0);
        }

    }

}
