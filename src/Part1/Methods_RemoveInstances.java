package Part1;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods_RemoveInstances {

    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {

        while (r.contains(n)) {
            r.remove(n);
        }
        return r;
    }


}
