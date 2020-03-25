import java.util.Scanner;

public class A44_Blackjacket {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();

        //your code here

        if (player > 21) {

            System.out.println("bust");
        }
        if (player < house) {

            System.out.println("player loss");

        }
        if (player == house) {

            System.out.println("its a tie");

        }
        if (player > house) {

            System.out.println("player wins");

        }

    }

}
