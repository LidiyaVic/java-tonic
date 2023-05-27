package src.main.Java.HomeTask7.Calc;

/**
 * реалізувати сімейство калькуляторів (Простий, Фінансовий, Бухгалтерський) Інженерний, Програмований)
 * всі вони повинні вміти виконувати базові операції(+,-.*,/ ) плюс свої специфічні функції;
 */

public class Calculator {
    public double Sum(double a, double b) {
        return a + b;
    }

    public double Min(double a, double b) {
        return a - b;
    }

    public double Mult(double a, double b) {
        return a * b;
    }

    public double Div(double a, double b) {
        if (b == 0) {
            System.out.println("Помилка. Ділення на нуль");
            throw new ArithmeticException("Ділення на 0");
        }
        return a / b;
    }
}

class FinancialCalculator extends Calculator {
    public double calculateInterest(double principal, double rate, double time) {
        return principal * rate * time;
    }
}

class AccountingCalculator extends Calculator {
    public double calculateDepreciation(double cost, double salvageValue, double usefulLife) {
        return (cost - salvageValue) / usefulLife;
    }
}

class EngineeringCalculator extends Calculator {
    public double calculateSquareRoot(double number) {
        if (number >= 0) {
            return Math.sqrt(number);
        } else {
            System.out.println("Помилка");
            throw new IllegalArgumentException("Квадратний корінь не визначений для від'ємних чисел");
        }
    }
}

class ProgrammingCalculator extends Calculator {
    //не знаю які операції має виконувати
}


