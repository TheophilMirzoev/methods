import java.time.LocalDate;

public class Main
{
    public static void determineWhetherTheLeapYear(int year1) {

        if (year1 % 100 == 0 && year1 % 400 == 0){
            System.out.println(year1 + " високосный");
        } else if (year1 % 4 ==0 && year1 % 100 > 0) {
            System.out.println(year1 + " високосный");
        } else if (year1 % 100 ==0) {
            System.out.println(year1 + " - не високосный");
        } else{
            System.out.println(year1 + " не високосный");
        }
    }

    static public void determineTheSystemAndYearOfRelease( int clientDeviceYear, String clientOS) {

        if(clientOS =="ios" && clientDeviceYear == LocalDate.now().getYear()){
            System.out.println("Установите версию приложения для ios по ссылке");
        } else if (clientOS == "android" && clientDeviceYear == LocalDate.now().getYear()){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        if(clientOS == "ios" && clientDeviceYear < LocalDate.now().getYear()){
            System.out.println("Установите облегченную версию приложения для ios по ссылке");
        } else if (clientOS == "android" && clientDeviceYear < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    static public int calculateTheNumberOfDaysFromTheDistance(int deliveryDistance) {

        if(deliveryDistance <= 20){
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
        return deliveryDistance;
    }

    public static void main(String[] args) {
        System.out.println("  задача 1");
        int year = LocalDate.now().getYear();
        determineWhetherTheLeapYear(year);

        System.out.println("  задача 2");

        String clientOS = "android";
        int clientDeviceYear = 2020;
        determineTheSystemAndYearOfRelease(clientDeviceYear, clientOS);

        System.out.println("  задача 3");

        int deliveryDistance = 50;
        calculateTheNumberOfDaysFromTheDistance(deliveryDistance);

    }

}