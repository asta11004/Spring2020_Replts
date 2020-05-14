package Part1;

public class A178_Methods {
    public static int[] mergR(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        for (int j = 0; j < b.length; j++) {
            result[j + a.length] = b[j];
        }

        return result;
    }

}
