package pl.javastart.euler2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class FibonacciCalculatorTest {

    FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();

    int fibonacciSequenceSum;

    @Test
    void shouldReturn0WhenGiven0() {

        fibonacciSequenceSum = fibonacciCalculator.getFibonacciSequence(0);

        assertThat(0).isEqualTo(fibonacciSequenceSum);

    }

    @Test
    void shouldReturn10WhenGiven10() {

        fibonacciSequenceSum = fibonacciCalculator.getFibonacciSequence(10);

        assertThat(10).isEqualTo(fibonacciSequenceSum);

    }

    @Test
    void shouldReturn44WhenGiven34() {

        fibonacciSequenceSum = fibonacciCalculator.getFibonacciSequence(34);

        assertThat(44).isEqualTo(fibonacciSequenceSum);


    }

    @Test
    void shouldReturn4613732WhenGiven4000000() {

        fibonacciSequenceSum = fibonacciCalculator.getFibonacciSequence(4000000);

        assertThat(4613732).isEqualTo(fibonacciSequenceSum);

    }




}