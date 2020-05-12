package Part1;

public class A156_Methods {
    public static int  count_appearance(String[] arr, String t){
        int count = 0;

        for(String each: arr){
            if(each.equals(t)){
                count++;
            }
        }
        return count;

    } //end  count_appearance
}
