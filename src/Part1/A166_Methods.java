package Part1;

public class A166_Methods {
    public static String mergeStrings(String one, String two) {
        String merge = "";

        if (one.length() >= two.length()) {

            for (int i = 0; i <= two.length() - 1; i++) {
                merge += one.charAt(i);
                merge += two.charAt(i);
            }

            merge += one.substring(two.length());

        } else {
            for (int i = 0; i < one.length(); i++) {
                merge += one.charAt(i);
                merge += two.charAt(i);
            }
            merge += two.substring(one.length());

        }

        return merge;

    }


}
