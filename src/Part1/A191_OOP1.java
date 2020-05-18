package Part1;

class Atts {
    public String name;
    public String color;
    public int amount;

    public String asString() {
        return "name: " + name + " color: " + color + " amount: " + amount;
    }

}

public class A191_OOP1 {

    public static void main(String[] args) {

        Atts a = new Atts();
        a.name = "ball";
        a.color = "red";
        a.amount = 1;


        System.out.println(a.asString());
    }


}
