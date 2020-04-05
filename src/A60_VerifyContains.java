import java.util.Scanner;

public class A60_VerifyContains {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        String sentence = scan.nextLine();

        boolean result = sentence.contains(word);
        System.out.println(result);

    }

}
