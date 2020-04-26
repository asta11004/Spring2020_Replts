package Part1;

import java.util.Scanner;

public class AssessmentTest1_4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double weight = scan.nextDouble();
        int cal =(int) (0.0175 * (30*10+30*8+360*1) * (weight/2.2));
        System.out.println("Calories Burned: "+cal);

    }
}
