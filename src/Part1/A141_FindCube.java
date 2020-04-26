package Part1;

import java.util.Scanner;

public class A141_FindCube {

    public static void cube() {
        //your code here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1=input.nextInt();
        int cubeofNum=num1*num1*num1;
        System.out.println(cubeofNum);

    }//end cube

}
