@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println("Задача 2");
        int clientDeviceYear = 2016;
        int clientOS_2 = 1;
        if (clientOS_2 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке»");
            } else System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS_2 == 1) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android  по ссылке»");
            } else System.out.println("Установите версию приложения для Android  по ссылке");
        }
        System.out.println("Задача 3");
        int year = 2019;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 )) {
            System.out.println(year + " год является високосным");
        }else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 200;
        int deliveryDays = 0;
        if (deliveryDistance < 20) {
            deliveryDays = 1;
        }else if (deliveryDistance < 60) {
            deliveryDays = 2;
        }else if (deliveryDistance < 100) {
            deliveryDays = 3;
        }
        if (deliveryDays == 0) {
            System.out.println("Доставки нет");
        }else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        System.out.println("Задача 5");
        int monthNumber = 6;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого не существует");
        }

        }
}
