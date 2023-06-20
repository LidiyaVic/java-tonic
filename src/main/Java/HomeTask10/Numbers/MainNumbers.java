package src.main.Java.HomeTask10.Numbers;
import java.util.ArrayList;

public class MainNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(120);
        numbers.add(1);
        numbers.add(77);
        numbers.add(9);
        numbers.add(51);

        int mainNumber = 50;
        int i = 0;
        int allNumbers = numbers.size() - 1;

        while (i <= allNumbers) {
            if (numbers.get(i) <= mainNumber) {
                i++;
            } else if (numbers.get(allNumbers) > mainNumber) {
                allNumbers--;
            } else {
                int num = numbers.get(i);
                numbers.set(i, numbers.get(allNumbers));
                numbers.set(allNumbers, num);
            }
        }
        System.out.println(numbers);
    }
}