import java.util.Scanner;

public class A76_BuildARoute {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        String rest = "";

        if (start.equals("A")) {
            if (end.equals("B")) {
                rest += "right: " + end + " found";
            } else if (end.equals("C")) {
                rest += "right > down: " + end + " found";
            } else if (end.equals("D")) {
                rest += "right > down > left: " + end + " found";
            } else {
                rest += start + " found";
            }

        } else if (start.equals("B")) {
            if (end.equals("C")) {
                rest += "down: " + end + " found";
            } else if (end.equals("D")) {
                rest += "down > left: " + end + " found";
            } else if (end.equals("A")) {
                rest += "down > left > up: " + end + " found";
            } else {
                rest += start + " found";
            }

        } else if (start.equals("C")) {
            if (end.equals("D")) {
                rest += "left: " + end + " found";
            } else if (end.equals("A")) {
                rest += "left > up: " + end + " found";
            } else if (end.equals("B")) {
                rest += "left > up > right: " + end + " found";
            } else {
                rest += start + " found";
            }

        } else if (start.equals("D")) {
            if (end.equals("A")) {
                rest += "up: " + end + " found";
            } else if (end.equals("B")) {
                rest += "up > right: " + end + " found";
            } else if (end.equals("C")) {
                rest += "up > right > down: " + end + " found";
            } else {
                rest += start + " found";
            }
        }

        System.out.println(rest);
    }

}
