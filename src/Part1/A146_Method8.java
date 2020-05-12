package Part1;

import java.util.Scanner;

public class A146_Method8 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s);
    }

    public static void person(String info) {

        String[] arr = info.split(",");
        System.out.println("person name: " + arr[0] + " last name: " + arr[1] + " age: " + arr[2]);

    }//end per
}
