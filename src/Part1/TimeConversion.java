package Part1;

import java.time.LocalTime;

public class TimeConversion {
    public static void timeConversion(String s) {

        String origin = s;
        s = s.substring(0, s.length() - 2);

        String[] arr = s.split(":");
        int hour = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[1]);
        int seconds = Integer.parseInt(arr[2]);
        LocalTime tm;

        if (origin.contains("PM") && seconds==0) {
            tm = LocalTime.of(hour + 12, min, seconds);
            System.out.println(tm + ":00");
        }else if (origin.contains("PM") && seconds!=0) {
            tm = LocalTime.of(hour + 12, min, seconds);
            System.out.println(tm);
        }else if (seconds ==0 && origin.contains("AM")) {
            tm = LocalTime.of(hour, min, seconds);
            System.out.println(tm + ":00");
        }else if (seconds !=0 && origin.contains("AM")){
            tm = LocalTime.of(hour, min, seconds);
            System.out.println(tm);
        }

    }
}
