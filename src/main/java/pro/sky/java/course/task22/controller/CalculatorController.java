package pro.sky.java.course.task22.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course.task22.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greetings() {
        return calculatorService.greetings();
    }

    @GetMapping("/plus")
    public double addTwoNums(@RequestParam("num1") double firstNum, @RequestParam("num2") double secondNum) {
        return calculatorService.addTwoNums(firstNum, secondNum);
    }

    @GetMapping("/minus")
    public double substractTwoNums(@RequestParam("num1") double firstNum, @RequestParam("num2") double secondNum) {
        return calculatorService.substractTwoNums(firstNum, secondNum);
    }

    @GetMapping("/multiply")
    public double multiplyTwoNums(@RequestParam("num1") double firstNum, @RequestParam("num2") double secondNum) {
        return calculatorService.multiplyTwoNums(firstNum, secondNum);
    }

    @GetMapping("/divide")
    public double divideTwoNums(@RequestParam("num1") double firstNum, @RequestParam("num2") double secondNum) {
        return calculatorService.divideTwoNums(firstNum, secondNum);
    }
}
