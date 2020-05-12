package Part1;

public class A159_Methods {
    public static String c_profits (int buyPrice,int sellPrice){
        //your code here
        if(buyPrice<sellPrice){
            return "profit";
        }else if(buyPrice>sellPrice){
            return "loss";
        }else {
            return "no loss";
        }

    }
}
