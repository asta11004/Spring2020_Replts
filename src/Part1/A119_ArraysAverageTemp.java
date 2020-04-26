package Part1;

import java.util.Scanner;

public class A119_ArraysAverageTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};

        for (int i = 0; i < temps.length; i++) {
            total += temps[i];
            k++;
        }

        avgTemp = total / k;
        System.out.println(avgTemp);


    }
}
