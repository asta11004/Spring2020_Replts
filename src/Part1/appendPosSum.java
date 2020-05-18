package Part1;

import java.util.ArrayList;

public class appendPosSum {


    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {

        ArrayList<Integer> aList = new ArrayList<>();

        int sum = 0;
        for (Integer each : list) {
            if (each > 0) {
                aList.add(each);
            }
        }

        for (int i = 0; i < aList.size(); i++) {
            sum += aList.get(i);
        }

        aList.add(sum);

        return aList;
    }

}
