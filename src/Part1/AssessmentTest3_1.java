package Part1;

import java.util.Scanner;

public class AssessmentTest3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.next();
        int year = scan.nextInt();
        boolean recalled = false;

        if(model.equalsIgnoreCase("Extravagant" )){
            if(year>=2010 && year <=2012){
               recalled = true;
            }
        }
        if(model.equalsIgnoreCase("Guzzler")){
            if(year>=2015 && year<=2018){
                recalled = true;
            }
        }

        System.out.println(recalled);

    }
}
