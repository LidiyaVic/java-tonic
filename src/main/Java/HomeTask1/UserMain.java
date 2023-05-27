package src.main.Java.HomeTask1;

public class UserMain {
    public static void main(String[] args) {
        User firstUser = new User();
        firstUser.userName = "Olha";
        firstUser.setAge(23);
        int firstUserAge = firstUser.getAge();
        firstUser.email = "olha@gmail.com";
        firstUser.setPassword("password123");
        String firstUserPassword = firstUser.getPassword();
        firstUser.isActive = true;
        firstUser.makePurchase(45);
        firstUser.makePurchase(15);
        firstUser.printTotalAmountOfSpentMoney();
        firstUser.addDiscount(5);

        System.out.println(firstUser.userName + "\n" + firstUserAge + "\n" + firstUser.email + "\n" + firstUserPassword + "\n" + firstUser.isActive + "\n");


        User secondUser = new User();
        secondUser.userName = "Anna";
        secondUser.setAge(33);
        int secondUserAge = secondUser.getAge();
        secondUser.email = "olha@gmail.com";
        secondUser.setPassword("987654321");
        String secondUserPassword = secondUser.getPassword();
        secondUser.isActive = false;
        secondUser.makePurchase(140);
        secondUser.makePurchase(150);
        secondUser.printTotalAmountOfSpentMoney();
        secondUser.addDiscount(10);

        System.out.println(secondUser.userName + "\n" + secondUserAge + "\n" + secondUser.email + "\n" + secondUserPassword + "\n" + secondUser.isActive + "\n");
    }
}
