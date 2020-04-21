import java.util.Scanner;

public class A72_Email1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (email.contains("_")) {
            String firstName = email.substring(0, email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));
            System.out.println(lastName.concat("_").concat(firstName).concat(domain));
        } else {
            System.out.println(email);
        }

    }
}
