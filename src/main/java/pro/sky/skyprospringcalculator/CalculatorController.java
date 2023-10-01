package pro.sky.skyprospringcalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;
    private int num1;
    private int num2;
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService=calculatorService;
        this.num1 = num1;
        this.num2 = num2;
    }

    @GetMapping
    public String welcome(){
        return calculatorService.welcome();
    }
    @GetMapping(path = "/calculator")
    public String answerWelcome(@RequestParam("name") String userName){
        return calculatorService.answerWelcome(userName);
    }
    @GetMapping(path = "/caclculator/plus")
    public String plusCalculator(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return "Сложение " + num1 + " + " + num2 + " = " + calculatorService.plusCalculator(num1, num2);
    }
    @GetMapping(path = "/caclculator/minus")
    public String minusCalculator(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return "Вычитание " + num1 + " - " + num2 + " = " + calculatorService.minusCalculator(num1, num2);
    }
    @GetMapping(path = "/caclculator/multiply")
    public String multiplyCalculator(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return "Умножение " + num1 + " * " + num2 + " = " + calculatorService.multiplyCalculator(num1, num2);
    }
    @GetMapping(path = "/caclculator/divide")
    public String divideCalculator(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return "Деление " + num1 + " / " + num2 + " = " + calculatorService.divideCalculator(num1, num2);
    }

}

