package Part1;

public class SwitchElement {
    public static int[] do_switch(int[] i) {
        int first = i[0];

        i[0] = i[i.length - 1];

        i[i.length - 1] = first;

        return i;

    }
}
