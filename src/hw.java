import java.time.LocalDate;

public class hw {


    //Задача 2
    private static void printInstallationMessage(String osName, int productoinYear) {
        var currentYear = LocalDate.now().getYear();
        ;
        if (osName.equals("Android") && productoinYear < currentYear) {
            System.out.println("Установите облегченную версию для Андроид по ссылке");
        } else if (osName.equals("Android") && productoinYear > currentYear) {
            System.out.println("Установите версию для Андроид по ссылке");
        } else if (osName.equals("iOS") && productoinYear < currentYear) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        } else {
            System.out.println("Установите версию для iOS");
        }
    }

    // Задача 1
    private static void printIsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + "год не является высокосным");
        }
    }

    //Задача 3
    private static int printCalculeteDeliveryDays(int distanse) {
        int step = 40;
        int startInterval = 20;
        int result =1; //колличество дней
        if (distanse >= startInterval) {
            result =(Math.abs((distanse-startInterval)/step)+2);
        }
        return result;
    }


    public static void main(String[] args) {
        String osName = "iOS";
        int productoinYear = 2020;
        var currentYear = LocalDate.now().getYear();
        printInstallationMessage(osName, productoinYear);
        System.out.println();
        int year = 2016;
        printIsLeap(year);
        System.out.println();
        int distanse = 90;
        System.out.println("Потребуется дней: " + printCalculeteDeliveryDays(distanse));

    }

}



