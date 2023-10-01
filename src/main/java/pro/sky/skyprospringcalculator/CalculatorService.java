package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String welcome(){
        return "Добро пожаловать в калькулятор";
    }
    public String answerWelcome(String userName){
        return "Добро пожаловать в калькулятор " + userName;
    }
    public String plusCalculator(int num1, int num2) {
        return String.valueOf((num1 + num2));
    }

    public String minusCalculator(int num1, int num2) {
        return String.valueOf((num1 - num2));
    }

    public String multiplyCalculator(int num1, int num2) {
        return String.valueOf((num1 * num2));
    }

    public String divideCalculator(int num1, int num2) {
        if (num2 == 0) {
            return "Делить на 0 нельзя";
        } else {
            return String.valueOf((float) (num1 / num2));
        }
    }
}

