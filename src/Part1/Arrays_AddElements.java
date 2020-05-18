package Part1;

public class Arrays_AddElements {

    public static int[] addElements(int[] ints1, int[] ints2) {

        for (int i = 0; i < ints1.length && i < ints2.length; i++) {
            ints1[i] = ints1[i] + ints2[i];
        }

        return ints1;

    }

}
