package Part1;

import java.util.Scanner;

public class A139_Method1_SimpleCalc {

    public static void plus(){
        //your code here
        Scanner scan = new Scanner(System.in);

        int first = scan.nextInt();

        int second =scan.nextInt();
        int result = first+second;
        System.out.println("result: "+result);

    }

}
