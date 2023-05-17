package src.main.Java.HomeTask2;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println("Результат додавання дорівнює " + calculator.Sum (15,16));
        System.out.println("Результат віднімання дорівнює " + calculator.Min (29,8));
        System.out.println("Результат множення дорівнює " + calculator.Mult (11,11));
        System.out.println("Результат ділення дорівнює " + calculator.Div (100,5));
        System.out.println("Результат ділення дорівнює " + calculator.Div (25,0));
    }
}