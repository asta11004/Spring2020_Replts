import java.util.Scanner;

public class AssessmentTest1_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        //your code here
        String str = (num1 > num2 && num1 > num3) ? ("n1 is bigger")
                : num2 > num1 && num2 > num3 ? "n2 is bigger"
                : "n3 is bigger";

        System.out.println(str);


    }

}
