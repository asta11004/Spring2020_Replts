package Part1;

public class A144_Method6 {

    public static void sign(int n) {
        //your code here

        if (n > 0) {
            n =1;
        } else if (n < 0) {
            n = -1;
        } else {
            n = 0;
        }

        System.out.println(n);

    }//end sign

}
