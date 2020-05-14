package Part1;

public class A171_methods {
    public static String limit(String text, int maxLength) {
        String ss = "";

        for (int i = 0; i < text.length(); i++) {

            if (ss.length() < maxLength) {
                ss += text.charAt(i);
            }
        }
        return ss;
    }
}
