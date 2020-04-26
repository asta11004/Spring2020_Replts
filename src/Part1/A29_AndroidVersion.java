package Part1;

import java.util.Scanner;

public class A29_AndroidVersion {

    public static void main(String[] args) {

        // DO NOT CHANGE:
        Scanner input = new Scanner(System.in);
        double version = input.nextDouble();

        String result = "";
        if (version == 1.5) {
            result = "Cupcake";
        } else if (version == 1.6) {
            result = "Donut";
        } else if (version == 2.1) {
            result = "Eclair";
        } else if (version == 2.2) {
            result = "Froyo";
        } else if (version == 2.3) {
            result = "Gingerbread";
        } else if (version == 3.1) {
            result = "Honeycomb";
        } else if (version == 4.0) {
            result = "Ice Cream Sandwich";
        } else if (version >= 4.1 && version <= 4.31) {
            result = "Jelly Bean";
        } else if (version >= 4.4 && version <= 4.44) {

            result = "KitKat";
        } else if (version >= 5.0 && version <= 5.11) {
            result = "Lollipop";
        } else if (version >= 8.0 && version <= 8.1) {
            result = "Oreo";
        } else if (version == 9.0) {
            result = "Pie";
        } else {
            result = "Sorry,I don't know this version";

        }

        System.out.println(result);

    }

}
