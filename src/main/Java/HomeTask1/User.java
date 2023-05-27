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

    public String userName;
    private int age;
    public String email;
    private String password;
    public boolean isActive;
    public int amountSpentMoney;
    public int percent;

    public User() {

    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void makePurchase(double purchasePrice) {
        this.amountSpentMoney += purchasePrice;
        System.out.println("Сума, на яку здійснена покупка " + purchasePrice);
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println("Загальна сума покупки " + amountSpentMoney);
    }

    /**
     * Додати в класс User метод addDiscount, який приймає параметр відсоток знижки(percent типу int),
     * та вираховує знижку для amountSpentMoney
     */

    public void addDiscount(int percent) {
        int discount = (amountSpentMoney * percent) / 100;
        System.out.println("Сума знижки " + discount);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Не вірно вказано вік");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() > 8) {
            this.password = password;
        } else {
            System.out.println("Пароль не валідний");
        }
    }
}