package Part1;

import java.util.ArrayList;

public class Methods_2Times {
    //create your method below
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> intArr) {

        ArrayList<Integer> doubArr = new ArrayList<>();

        for (int num : intArr) {
            doubArr.add(num);
            doubArr.add(num);
        }

        return doubArr;

    }
}
