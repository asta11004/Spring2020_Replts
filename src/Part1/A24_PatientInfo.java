package Part1;

import java.util.Scanner;

public class A24_PatientInfo {
    public static void main(String[] args) {
        //Enter your code here
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");

        System.out.println("Enter your first name");
        String FirstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();
        scan.nextLine();

        System.out.println("Enter your email");
        String email = scan.nextLine();

        System.out.println("Enter your street");
        String street = scan.nextLine();


        System.out.println("Enter your city");
        String city = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.nextLine();


        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();

        String contacs = "Contacts: work phone number - " + workPhoneNumber + ", " + "personal phone number - " +
                personalPhoneNumber + ", " + "email: " + email;
        String fullName = "Full name: " + lastName + ", " + FirstName;

        String adress = "Address: " + street + ", " + city + ", " + state + " " + zipcode;


        System.out.println("Patient personal information");

        System.out.println(fullName);
        System.out.println(adress);
        System.out.println(contacs);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Married?: " + isMarried);
    }
}
