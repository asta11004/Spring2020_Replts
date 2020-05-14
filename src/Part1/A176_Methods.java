package Part1;

import java.util.Arrays;

public class A176_Methods {

    public class Main {
        //WRITE YOUR CODE HERE


        public int findMax(int[] arr) {

            Arrays.sort(arr);
            int maxNum = arr[arr.length - 1];

            return maxNum;
        }

        public double findMax(double[] arr) {

            Arrays.sort(arr);
            double maxNum = arr[arr.length - 1];

            return maxNum;
        }
    }
}
