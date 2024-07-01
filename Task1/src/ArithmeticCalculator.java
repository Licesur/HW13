public class ArithmeticCalculator {
    private int a;
    private int b;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }


    public int getB() {
        return b;
    }

    public double calculate(Operation operation){
        if(operation == Operation.ADD){
            return getA() + getB();
        } else if (operation == Operation.MULTIPLY) {
            return getB() * getA();
        } else if (operation == Operation.SUBTRACT) {
            return getA() / getB();
        }
        else return 0;
    }
}
