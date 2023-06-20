package src.main.Java.HomeTask10.ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> collection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            collection.add(random.nextInt(50));
        }
        System.out.println(collection);
    }
}