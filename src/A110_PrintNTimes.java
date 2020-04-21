import java.util.Scanner;

public class A110_PrintNTimes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int j=0; j<n; j++){
            System.out.print("*");
        }
    }

}
