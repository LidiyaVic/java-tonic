/**
1. Є рядок із текстом англійською мовою. Виділити всі унікальні слова.
Слова, які відрізняються лише регістром букв, вважати однаковими.
Використовуйте клас HashSet.
 */

package src.main.Java.HomeTask11.HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class SetUniqueWords {
    public static void main(String[] args) {
        String text = "Education is the key that unlocks the door to endless possibilities and empowers you to shape your own future";
        String[] words = text.toLowerCase().split(" ");
        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }
    }
}
