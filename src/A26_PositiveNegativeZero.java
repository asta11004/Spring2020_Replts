import java.util.Scanner;

public class A26_PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        boolean positive=(num > 0);
        boolean negative=(num < 0);
        boolean zero=(num==0);

        //your code here
        if (positive){
            System.out.println("positive");
        }
        if(negative){
            System.out.println("negative");
        }
        if(zero){
            System.out.println("zero");
        }


    }
}
