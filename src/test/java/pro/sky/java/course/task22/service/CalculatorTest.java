package pro.sky.java.course.task22.service;

import org.junit.jupiter.api.Test;
import pro.sky.java.course.task22.exception.YouCantDivideByZero;
import pro.sky.java.course.task22.service.CalculatorService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


public class CalculatorTest {

    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

    @Test
    public void addTwoNumsTest() {
        double actual = calculatorServiceImpl.addTwoNums(17, 8);
        assertThat(actual).isEqualTo(25.0);
        actual = calculatorServiceImpl.substractTwoNums(19, 24);
        assertThat(actual).isEqualTo(-5.0);
    }

    @Test
    public void substactTwoNumsTest() {
        double actual = calculatorServiceImpl.substractTwoNums(13, 19);
        assertThat(actual).isEqualTo(-6.0);
        actual = calculatorServiceImpl.substractTwoNums(-7, -22);
        assertThat(actual).isEqualTo(15.0);
    }

    @Test
    public void multiplyTwoNumsTest() {
        double actual = calculatorServiceImpl.multiplyTwoNums(5, 3);
        assertThat(actual).isEqualTo(15.0);

        actual = calculatorServiceImpl.multiplyTwoNums(-4, 6);
        assertThat(actual).isEqualTo(-24.0);
    }

    @Test
    public void divideTwoNumsTest() {
        double actual = calculatorServiceImpl.divideTwoNums(10, 2);
        assertThat(actual).isEqualTo(5.0);

        actual = calculatorServiceImpl.divideTwoNums(-22, 44);
        assertThat(actual).isEqualTo(-0.5);
    }

    @Test
    public void divideTwoNumsNegativeTest() {
        assertThatExceptionOfType(YouCantDivideByZero.class)
                .isThrownBy(() -> calculatorServiceImpl.divideTwoNums(5, 0))
                .withMessage("Делить на ноль нельзя!");

        assertThatExceptionOfType(YouCantDivideByZero.class)
                .isThrownBy(() -> calculatorServiceImpl.divideTwoNums(-11, 0))
                .withMessage("Делить на ноль нельзя!");
    }

}
