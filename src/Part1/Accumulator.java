package Part1;

public class Accumulator {

    int sum;

    public Accumulator(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void add(int num) {
        sum = sum + num;
    }

    public void remove(int num) {
        sum = sum - num;
    }

    public String toString() {
        return "Sum is: " + sum;
    }
}