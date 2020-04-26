package Part1;

import java.util.Scanner;

public class A45_BurgerOrChicken {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String in = s.next();
        //your code here
        double price = 10.0;
        double soda = 2.0;
        if (in.equals("burger") || in.equals("chicken")) {
            System.out.println(price);
        }

        if (in.equals("soda")) {
            System.out.println(soda);
        }

    }

}
