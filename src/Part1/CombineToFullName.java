package Part1;

public class CombineToFullName {

    public static String[] combineNames(String[] first_names, String[] last_names) {
        String[] arr = new String[first_names.length];

        int i = 0;

        for (String each : arr) {
            arr[i] = first_names[i] + " " + last_names[i];
            i++;
        }

        return arr;

    }

    public static void main(String[] args) {
        //feel free to test code here
    }

}
