package Part1;

public class A145_Method7 {

    public static String plus_minus2(int[] arr) {

        int positive = 0;
        int negative = 0;
        int zeros = 0;

        String result = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
            if (arr[i] > 0) {
                positive++;
            }
            if (arr[i] < 0) {
                negative++;
            }
        }

        result += "positives:" + positive + ", negatives:" + negative + ", zeros:" + zeros;
        return result;
    }

}
