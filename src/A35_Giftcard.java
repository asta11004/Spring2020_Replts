import java.util.Scanner;

public class A35_Giftcard {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        //WRITE YOUR CODE HERE
        if (item.equalsIgnoreCase("Smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");

        } else if (item.equalsIgnoreCase("laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equalsIgnoreCase("charger")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (100 - 15) + "$");
        } else if (item.equalsIgnoreCase("usb cable")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (100 - 10) + "$");
        } else if (item.equalsIgnoreCase("headphones")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (100 - 30) + "$");
        } else if (item.equalsIgnoreCase("pants")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (100 - 50) + "$");
        } else if (item.equalsIgnoreCase("hat")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (100 - 25) + "$");
        } else if (item.equalsIgnoreCase("socks")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (100 - 5) + "$");
        } else if (item.equalsIgnoreCase("blanket")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (100 - 60) + "$");
        } else if (item.equalsIgnoreCase("pillow")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (100 - 40) + "$");
        } else {
            System.out.println("invalid item!");
        }

    }

}
