package src.main.Java.HomeTask7.Calc;

public class Main {
    public static void main(String[] args) {
        FinancialCalculator financialCalculator = new FinancialCalculator();
        AccountingCalculator accountingCalculator = new AccountingCalculator();
        EngineeringCalculator engineeringCalculator = new EngineeringCalculator();

        double result1 = financialCalculator.Sum(20, 10);
        double result2 = accountingCalculator.Mult(15, 13);
        double result3 = engineeringCalculator.Min(19, 7);
        double result4 = financialCalculator.Div(100, 3);

        System.out.println("Фінансовий калькулятор, додавання " + result1);
        System.out.println("Бухгалтерський калькулятор, множення " + result2);
        System.out.println("Інженерний калькулятор, віднімання " + result3);
        System.out.println("Фінансовий калькулятор, ділення " + result4);

        double calcInterest = financialCalculator.calculateInterest(500, 0.5, 8);

        System.out.println("Специфічна функція фінансового калькулятора " + calcInterest);
    }
}

