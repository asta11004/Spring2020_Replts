package Part1;

public class A189_Methods {
    public static boolean isError(String line) {

        if (line.startsWith("error")) {
            return true;
        } else {
            return false;
        }

    }
}
