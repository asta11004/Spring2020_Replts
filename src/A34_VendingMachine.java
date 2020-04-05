import java.util.Scanner;

public class A34_VendingMachine {

    public static void main(String[] args) {
        //ENTER CODE HERE
        Scanner s = new Scanner(System.in);
        System.out.println("Enter price in cents:");
        int itemPrice = s.nextInt();
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int remainder = 100 - itemPrice;

        boolean condition = (itemPrice >= 25 && itemPrice <= 100) && (itemPrice % 5 == 0);
        if (condition) {
            int quarters = remainder / quarter;
            int dimes = (remainder % quarter) / dime;
            int nickels = ((remainder % quarter) % dime) / nickel;
            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");

        } else {
            System.out.println("Invalid price!");
        }
    }

}
