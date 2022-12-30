package pl.javastart.euler2;

public class FibonacciCalculator {
    int getFibonacciSequence(int noExceedValue) {
        int cycles = 1;
        int sum = 0;
        int a = 0;
        int b = 1;
        for (int i = 0; i < cycles; i++) {
            int c = a + b;
            sum = getSumIfEven(sum, c);
            a = b;
            b = c;
            cycles++;
            if (b >= noExceedValue) {
                return sum;
            }

        }
        return 0;
    }

    private int getSumIfEven(int sum, int c) {
        if (c % 2 == 0) {
            sum += c;
        }
        return sum;
    }

}
