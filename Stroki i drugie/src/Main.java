import java.time.LocalDate;

public class Main {
    //    задние 1
    public static void checkLeapYear(int year) {
        if (year < 1584) {
            System.out.println("В " + year + " Грегорианский календарь еще не введён");
        } else if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //задание 2
    public static void suggestAppVersion(int osType, int ClientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (ClientDeviceYear < currentYear && osType == 0) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        } else if (ClientDeviceYear < currentYear && osType == 1) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else if (osType == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static String distanceToDelivery(int deliveryDistance) {
        String deliveryDays = "";
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = "Потребуется дней: 2";
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = "Потребуется дней: 3";
        } else if (deliveryDistance <= 20 && deliveryDistance > 0) {
            deliveryDays = "Потребуется дней: 1";
        } else  {
            deliveryDays = "Доставки нет";
        }
        return deliveryDays;
    }

    public static void main(String[] args) {
//        задние 1
        checkLeapYear(1644);
//        задание 2
        suggestAppVersion(0, 2024);
//        задание 3
        System.out.println(distanceToDelivery(1));
    }
}


