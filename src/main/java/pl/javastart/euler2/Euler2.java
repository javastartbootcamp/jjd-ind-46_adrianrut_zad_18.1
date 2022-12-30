package pl.javastart.euler2;

import java.util.Arrays;

public class Euler2 {

    public static void main(String[] args) {

        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        int sumOfEvenNumbers = fibonacciCalculator.getFibonacciSequence(4000000);
        System.out.println(sumOfEvenNumbers);

    }
}
