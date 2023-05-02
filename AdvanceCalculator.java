public class AdvanceCalculator extends calculator {
    public int mul(int n1, int n2) {
        return n1*n2;
    }

    public int div(int n1, int n2) {
        return n1/n2;
    }

    // override
    public void display() {
        System.out.println("in advcalc");
    }

}
