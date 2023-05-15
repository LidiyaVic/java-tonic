package src.main.Java.HomeTask1;

/**
 * 1. Створити клас User, у якого будуть:
 * - поля userName, age, email, password, isActive(boolean), amountSpentMoney.
 * password та age повинні мати модифікатор доступу private.
 *
 * Зробити геттери і сеттери з валідацією для private полів(валідація довільна).
 *
 * - методи: makePurchase, який приймає параметр purchasePrice(вартість покупки) типу double,
 * і виводить на яку суму була здійснена покупка та додає цю вартість до глобальної змінної amountSpentMoney.
 *
 * printTotalAmountOfSpentMoney, який виводить загальну суму витрачених грошей.
 *
 * -конструктори: дефолтний; конструктор який приймає userName та контруктор який приймає userName та password.
 *
 * Створити додатковий клас для перевірки функціональності класса User,
 * де треба створити декілька екземплярів класса User з різними значеннями,
 * повикликати методи, в кінці програми вивести суму витрачених грошей, кожного юзера та інформацію про нього
 */
public class User {

    public User() {

    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String userName;
    private int age;
    public String email;
    private String password;
    public boolean isActive;
    public int amountSpentMoney;

    public int makePurchase(double purchasePrice) {
        System.out.println("Сума, на яку здійснена покупка " + purchasePrice);
        return 0;
    }

    public int printTotalAmountOfSpentMoney(int a, int b) {
        return a + b;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
