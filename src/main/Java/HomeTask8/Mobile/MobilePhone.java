package src.main.Java.HomeTask8.Mobile;

public abstract class MobilePhone implements Mobile {

    public void sendMessage(String message) {
        System.out.println("Відправлено повідомлення " + message);
    }
    public void getMessage(String message) {
        System.out.println("Отримано повідомлення " + message);
    }
    public void phoneNumber(int number) {
        System.out.println("Чат з " + number);
    }
}
