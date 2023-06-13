package src.main.Java.HomeTask10.ArrayAndLinkedList.ArrayList;

import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 25; i++) {
            list.add(i);
        }
        int index = 0;
        while (list.size() > 1) {
            index = (index + 1) % list.size();
            list.remove(index);
        }
        System.out.println(list.get(0));
    }
}