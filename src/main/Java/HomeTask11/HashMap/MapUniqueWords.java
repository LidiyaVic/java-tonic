/**
 * 2. Є рядок із текстом англійською мовою. Виділити всі унікальні слова.
 * Для кожного слова підрахувати частоту його входження в текст. Слова, які
 * відрізняються регістром літер, вважати різними. Використовувати клас
 * HashMap.
 */

package src.main.Java.HomeTask11.HashMap;

import java.util.HashMap;

public class MapUniqueWords {
    public static void main(String[] args) {
        String text = "In a land so grand I stand I stand With a book in hand I stand I stand";
        String[] words = text.split(" ");
        HashMap<String, Integer> uniqueWords = new HashMap<>();

        for (String word : words) {
            int calculate = uniqueWords.getOrDefault(word, 0);
            uniqueWords.put(word, calculate + 1);
        }

        for (String word : uniqueWords.keySet()) {
            int calculate = uniqueWords.get(word);
            System.out.println(word + " - частота використання " + calculate);
        }
    }
}
