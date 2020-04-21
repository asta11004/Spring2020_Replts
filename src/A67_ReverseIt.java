import java.util.Scanner;

public class A67_ReverseIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        int lastIndexNum = word.length() - 1;

        if (word.length() == 5) {
            String reverse = "";
            for (int i = lastIndexNum; i >= 0; i--) {
                reverse += word.charAt(i);
            }
            System.out.println(reverse);
        } else if (word.length() > 5) {
            System.out.println("Too long!");
        } else if (word.length() <= 4) {
            System.out.println("Too short!");
        }


    }
}
