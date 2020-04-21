import java.util.Scanner;

public class A86_Cats_Dogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        word.toLowerCase();
        while (word.contains("cat") || (word.contains("dog"))) {
            if (word.contains("cat")) {
                word = word.replaceFirst("cat", "");
                countOfCats++;
            } else if (word.contains("dog")) {
                word = word.replaceFirst("dog", "");
                countOfDogs++;
            }
        }

        if (countOfCats == countOfDogs) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
