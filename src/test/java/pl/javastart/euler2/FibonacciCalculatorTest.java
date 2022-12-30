package pl.javastart.euler2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class FibonacciCalculatorTest {

    FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();

    @Test
    void shouldReturn0WhenGiven0() {

        int fibonacciSequenceSum = fibonacciCalculator.getFibonacciSequence(0);

        assertThat(fibonacciSequenceSum).isEqualTo(0);

    }

    @Test
    void shouldReturn10WhenGiven10() {

        int fibonacciSequenceSum = fibonacciCalculator.getFibonacciSequence(10);

        assertThat(fibonacciSequenceSum).isEqualTo(10);

    }

    @Test
    void shouldReturn44WhenGiven34() {

        int fibonacciSequenceSum = fibonacciCalculator.getFibonacciSequence(34);

        assertThat(fibonacciSequenceSum).isEqualTo(44);


    }

    @Test
    void shouldReturn4613732WhenGiven4000000() {

        int fibonacciSequenceSum = fibonacciCalculator.getFibonacciSequence(4000000);

        assertThat(fibonacciSequenceSum).isEqualTo(4613732);

    }
}