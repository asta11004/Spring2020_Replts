package Part1;

public class A164_Methods {
    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {

        if (isAvailable == false || month == 7 && (day >= 1 && day <= 8) || year != 2018) {
            return false;
        } else {
            return true;
        }

    }
}
