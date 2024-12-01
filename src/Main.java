import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        leapYear(2020);
        leapYear(2025);
        leapYear(2000);

        defineAppVersion(0, 2020);
        defineAppVersion(1, 2024);

        System.out.println("Потребуется дней: " + cardDays(25)+ " срок доставки");
        System.out.println("Потребуется дней: " + cardDays(80)+ " срок доставки");



    }

    public static void leapYear(int year) {
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }

    public static void defineAppVersion(int mobileOs, int mobileYear) {
        String mobileOsName;
        switch (mobileOs) {
            case 0:
                mobileOsName = "iOs";
                break;
            case 1:
                mobileOsName = "Android";
                break;
            default:
                mobileOsName = "неизвестная ОС";
        }
        int currentYear = LocalDate.now().getYear();
        if (mobileYear != currentYear) {
            System.out.println("Для ОС " + mobileOsName + " установите lite-версию");
        } else {
            System.out.println("Для ОС " + mobileOsName + " установите обычную версию");
        }
    }
    public static int cardDays ( int distance){
        int deliveryDays;
        if (distance <= 20) {
            deliveryDays = 1;
        } else if (distance <= 60) {
            deliveryDays = 2;
        } else {
            deliveryDays = 3;
        }

        return deliveryDays;
    }
}

