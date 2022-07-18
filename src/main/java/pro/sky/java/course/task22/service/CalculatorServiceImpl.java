package pro.sky.java.course.task22.service;

import org.springframework.stereotype.Component;
import pro.sky.java.course.task22.exception.YouCantDivideByZero;

@Component("CalculatorService")
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String greetings() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    @Override
    public double addTwoNums(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    @Override
    public double substractTwoNums(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    @Override
    public double multiplyTwoNums(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    @Override
    public double divideTwoNums(double firstNum, double secondNum) {
        if (secondNum == 0) {
            throw new YouCantDivideByZero("Делить на ноль нельзя!");
        }
        return firstNum / secondNum;
    }

}
