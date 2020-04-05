import java.util.Scanner;

public class A52_Ternary1 {

    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        //WRITE YOUT CODE HERE
        int z = (x >= 5) ? x : -x;
        System.out.println(z);
    }


}
