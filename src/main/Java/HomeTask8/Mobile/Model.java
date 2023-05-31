package src.main.Java.HomeTask8.Mobile;

public class Model extends MobilePhone implements Mobile {
    protected String phoneModel;
    protected String provider;

    public Model (String provider, String phoneModel) {
        this.provider = provider;
        this.phoneModel = phoneModel;
    }

    public void phoneModel() {
        System.out.println("Модель телефону " + phoneModel);
    }

    public void provider() {
        System.out.println("Провайдер зв'язку " + provider);
    }
}


