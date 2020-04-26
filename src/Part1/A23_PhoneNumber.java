package Part1;

import java.util.Scanner;

public class A23_PhoneNumber {


    public static void main(String[] args) {

            Scanner input=new Scanner(System.in);

            int areaCode=input.nextInt();
            int localNumber=input.nextInt();

            String phoneNum = "("+areaCode+")"+"-"+localNumber;
            System.out.println("Calling number "+phoneNum);



        }

}
