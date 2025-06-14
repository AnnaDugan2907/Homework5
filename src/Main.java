//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1
        int clientOS = 0;

        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else{
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println(" ");

        //Задача 2
        int clientDeviceYear = 2014;

        if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


        System.out.println(" ");

        //Задача 3
        int year = 2021;

            if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println(year + " год является високосным" );
            }
            else {
                System.out.println(year + " год не является високосным");
            }

        System.out.println(" ");

        //Задача 4
        int deliveryDistance = 95;
        int deliveryDay = 1;

        if (deliveryDistance <= 20 ){
            System.out.println("Потребуется дней: " + deliveryDay);
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60){
            deliveryDay++;
            System.out.println("Потребуется дней: " + deliveryDay);
            }
            else if (deliveryDistance > 60 && deliveryDistance <= 100){
                    deliveryDay+=2;
                    System.out.println("Потребуется дней: " + deliveryDay);
                }
                else {
                    System.out.println("Доставки нет");
                }



        System.out.println(" ");

        //Задача 5
        int monthNumber = 11;

        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Сезон зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон весны");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон осень");
                break;
        }
    }
}