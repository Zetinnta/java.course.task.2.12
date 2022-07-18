package pro.sky.java.course.task22.service;

import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class ParameterizedTest {
    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

    @org.junit.jupiter.params.ParameterizedTest
    @MethodSource("parametersForAddTwoNums")
    public void addTwoNumsTest(double firstNum, double secondNum, double result) {
        assertThat(calculatorServiceImpl.addTwoNums(firstNum, secondNum)).isEqualTo(result);
    }

    @org.junit.jupiter.params.ParameterizedTest
    @MethodSource("parametersForSubstractTwoNums")
    public void substractTwoNumsTest(double firstNum, double secondNum, double result) {
        assertThat(calculatorServiceImpl.substractTwoNums(firstNum, secondNum)).isEqualTo(result);
    }

    @org.junit.jupiter.params.ParameterizedTest
    @MethodSource("parametersForMultiplyTwoNums")
    public void multiplyTwoNumsTest(double firstNum, double secondNum, double result) {
        assertThat(calculatorServiceImpl.multiplyTwoNums(firstNum, secondNum)).isEqualTo(result);
    }

    @org.junit.jupiter.params.ParameterizedTest
    @MethodSource("parametersForDivideTwoNums")
    public void divideTwoNumsTest(double firstNum, double secondNum, double result) {
        assertThat(calculatorServiceImpl.divideTwoNums(firstNum, secondNum)).isEqualTo(result);
    }

    public static Stream<Arguments> parametersForAddTwoNums() {
        return Stream.of(
                Arguments.of(5, 13, 18.0),
                Arguments.of(-2, 6, 4.0),
                Arguments.of(17, 21, 38.0),
                Arguments.of(12, -25, -13.0)
        );
    }

    public static Stream<Arguments> parametersForSubstractTwoNums() {
        return Stream.of(
                Arguments.of(5, 13, -8.0),
                Arguments.of(-2, 6, -8.0),
                Arguments.of(17, 21, -4.0),
                Arguments.of(12, -25, 37.0)
        );
    }

    public static Stream<Arguments> parametersForMultiplyTwoNums() {
        return Stream.of(
                Arguments.of(5, 13, 65.0),
                Arguments.of(-2, 6, -12.0),
                Arguments.of(17, 21, 357.0),
                Arguments.of(12, -25, -300.0)
        );
    }

    public static Stream<Arguments> parametersForDivideTwoNums() {
        return Stream.of(
                Arguments.of(8, 16, 0.5),
                Arguments.of(-2, 10, -0.2),
                Arguments.of(34, 17, 2.0),
                Arguments.of(12, -24, -0.5)
        );
    }




}
