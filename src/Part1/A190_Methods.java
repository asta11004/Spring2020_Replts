package Part1;

public class A190_Methods {

    public static boolean isPalindrome(String check) {

        String reverse = "";

        check = check.replaceAll(" ", "");
        for (int i = check.length() - 1; i >= 0; i--) {
            reverse += check.charAt(i);
        }

        if (check.equalsIgnoreCase(reverse)) {
            return true;
        } else {
            return false;
        }

    }

}
