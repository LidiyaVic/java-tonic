/**
 * Створити клас User з полями: firstName, secondName, age. Виконати наступні операції:
 * Створити список з 10 обєктів типу User
 * відсортувати за віком та записати в нову колекцію
 * Підрахувати середній вік юзерів
 * Сортувати по декількам властивостям: firstName і age
 * Перевірити чи є юзери у яких прізвище починаєтся з літери "S' або "А"
 * Перевірити чи всі юзери старше 18 років
 */

package src.main.Java.HomeTask12.Ex_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Ivan", "Artemenko", 66));
        userList.add(new User("Mariya", "Bondar", 30));
        userList.add(new User("Oleksandr", "Karas", 33));
        userList.add(new User("Olena", "Shevchenko", 28));
        userList.add(new User("Mykhailo", "Sydorenko", 15));
        userList.add(new User("Olha", "Kravchenko", 19));
        userList.add(new User("Dmytro", "Boyko", 31));
        userList.add(new User("Sofiya", "Lytovchenko", 47));
        userList.add(new User("Andriy", "Melnichenko", 92));
        userList.add(new User("Yana", "Ivanchenko", 23));

        List<User> sortedByAge = new ArrayList<>(userList);
        sortedByAge.sort(Comparator.comparingInt(User::getAge));

        double averageAge = userList.stream()
                .mapToDouble(User::getAge)
                .average()
                .orElse(0);

        List<User> sortedByFirstNameAndAge = new ArrayList<>(userList);
        sortedByFirstNameAndAge.sort(
                Comparator.comparing(User::getFirstName)
                        .thenComparingInt(User::getAge)
        );

        boolean lastNameWithFirstCharacter = userList.stream()
                .anyMatch(user -> user.getLastName().startsWith("S") || user.getLastName().startsWith("A"));

        boolean usersOver18 = userList.stream()
                .allMatch(user -> user.getAge() > 18);

        System.out.println("Сортування користувачів за віком ");
        sortedByAge.forEach(user -> System.out.println(user.getFirstName() + " " + user.getLastName() + " - " + user.getAge()));

        System.out.println("Середній вік користувачів " + averageAge);

        System.out.println("Користувачі, відсортовані за firstName та age ");
        sortedByFirstNameAndAge.forEach(user -> System.out.println(user.getFirstName() + " " + user.getLastName() + " - " + user.getAge()));

        System.out.println("Користувачі з прізвищем на 'S' та 'A' " + lastNameWithFirstCharacter);

        System.out.println("Користувачі старше 18 років " + usersOver18);
    }
}
