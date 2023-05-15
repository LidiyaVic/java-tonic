package src.main.Java.HomeTask1;

public class UserMain {
    public static void main(String[] args) {
        User firstUser = new User();
        firstUser.userName = "Olha";
        firstUser.setAge(23);
        int firstUserAge = firstUser.getAge();
        firstUser.email = "olha@gmail.com";
        firstUser.setPassword("12345");
        String firstUserPassword = firstUser.getPassword();
        firstUser.isActive = true;
        firstUser.amountSpentMoney = firstUser.makePurchase(12.50);

        System.out.println(firstUser.userName + "\n" + firstUserAge + "\n" + firstUser.email + "\n" + firstUserPassword + "\n" + firstUser.isActive + "\n");


        User secondUser = new User();
        secondUser.userName = "Anna";
        secondUser.setAge(33);
        int secondUserAge = secondUser.getAge();
        secondUser.email = "olha@gmail.com";
        secondUser.setPassword("54321");
        String secondUserPassword = secondUser.getPassword();
        secondUser.isActive = false;
        secondUser.amountSpentMoney = secondUser.makePurchase(14.40);

        System.out.println(secondUser.userName + "\n" + secondUserAge + "\n" + secondUser.email + "\n" + secondUserPassword + "\n" + secondUser.isActive + "\n");

        System.out.println("Загальна сума покупки " + secondUser.printTotalAmountOfSpentMoney((int) 12.50, (int) 14.40) + "\n");

        System.out.println("Загальна сума покупки " + secondUser.printTotalAmountOfSpentMoney(firstUser.amountSpentMoney, secondUser.amountSpentMoney));
    }
}
