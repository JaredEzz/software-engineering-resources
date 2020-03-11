public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public double power(int x, int y) {
        if (x == 0 && y <= 0) {
            throw new ArithmeticException("Not a Number");
        }
        double value = x;
        if (y < 0) {
            value = 1.0 / x;
            y = y * -1;
        }
        double result = 1.0;

        for (int i = 0; i < y; i++) {
            result *= value;
        }

        return result;
    }
}
