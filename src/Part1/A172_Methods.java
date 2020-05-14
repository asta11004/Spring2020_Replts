package Part1;

public class A172_Methods {
    public static String at3(String target, String word) {

        return target.substring(0, 3) + word + target.substring(3);
    }

    public static void main(String[] args) {

        String res = at3("longword", "foo");
        System.out.println(res);
    }

}
