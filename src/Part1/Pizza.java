package Part1;

public class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniTopping;
    private int hamToppings;


    public Pizza(String size, int cheeseToppings, int pepperoniTopping, int hamToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniTopping = pepperoniTopping;
        this.hamToppings = hamToppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniTopping() {
        return pepperoniTopping;
    }

    public void setPepperoniTopping(int pepperoniTopping) {
        this.pepperoniTopping = pepperoniTopping;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }


    public double calcCost() {

        if (size.equalsIgnoreCase("Small")) {
            return 10 + (cheeseToppings * 2) + (pepperoniTopping * 2) + (hamToppings * 2);
        } else if (size.equalsIgnoreCase("Medium")) {
            return 12 + (cheeseToppings * 2) + (pepperoniTopping * 2) + (hamToppings * 2);
        } else if (size.equalsIgnoreCase("Large")) {
            return 14 + (cheeseToppings * 2) + (pepperoniTopping * 2) + (hamToppings * 2);
        } else {
            return 0;
        }

    }

    public String getDescription() {
        return size + " Pizza with " + cheeseToppings + " Cheese toppings, " + pepperoniTopping + " Pepperoni toppings, and " + hamToppings + " Ham toppings." +
                "\nTotal Price: " + calcCost();
    }

}
