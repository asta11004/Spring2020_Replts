package Part1;

public class A167_Methods {

    public static String uniqueChars(String str) {
        String result = "";

        for( int i = 0; i < str.length(); i++){
            if(result.contains("" + str.charAt(i) ) ){
                continue;
            }
            result += str.charAt(i);
        }

        return result;

    }

}
