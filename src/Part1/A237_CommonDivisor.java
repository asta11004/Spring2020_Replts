package Part1;

public class A237_CommonDivisor {

    public static int commonDivisor(int m, int n){
        //WRITE YOUR CODE HERE

        while (m != n) {
            if(m > n) {
                m = m - n;
            }else {
                n = n - m;
            }
        }

        return n;
    }

}
