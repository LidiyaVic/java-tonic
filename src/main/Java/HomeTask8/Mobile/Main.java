package src.main.Java.HomeTask8.Mobile;

public class Main {
    public static void main(String[] args) {

        Model myFirstPhone = new Model("Lifecell", "IPhone");
        myFirstPhone.phoneModel();
        myFirstPhone.provider();
        myFirstPhone.phoneNumber(618356494);
        myFirstPhone.sendMessage("Привіт. Ти як?");
        myFirstPhone.getMessage("Привіт. Все добре" + "\n");

        Model mySecondPhone = new Model("Kyivstar", "Samsung");
        mySecondPhone.phoneModel();
        mySecondPhone.provider();
        mySecondPhone.phoneNumber(63945978);
        mySecondPhone.sendMessage("Зустріч завтра о 6 вечора");
        mySecondPhone.getMessage("Домовились");
    }
}