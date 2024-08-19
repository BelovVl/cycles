public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("итерация " + i);
        }

        System.out.println(" ");
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("итерация " + i);
        }

        System.out.println(" ");
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("итерация " + i);
        }

        System.out.println(" ");
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("итерация " + i);
        }

        System.out.println(" ");
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным. ");
        }

        System.out.println(" ");
        System.out.println("Задача 6");
        for (int i = 7; i <= 100; i = i + 7) {
            System.out.println("итерация " + i);
        }

        System.out.println(" ");
        System.out.println("Задача 7");
        for (int i = 1; i <= 1000; i = i * 2) {
            System.out.println("итерация " + i);
        }

        System.out.println(" ");
        System.out.println("Задача 8");
        int salary = 29000;
        int amount = 0;
        for (int month = 1; month <= 12; month++) {
            amount = amount + salary;
            System.out.println("Месяц  " + month + ", сумма накоплений равна " + amount + " рублей.");
        }

        System.out.println(" ");
        System.out.println("Задача 9");
        for (int month = 1; month <= 12; month++) {
            amount = amount + amount / 100;
            amount = amount + salary;
            System.out.println("Месяц  " + month + ", сумма накоплений равна " + amount + " рублей.");
        }

        System.out.println(" ");
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + i * 2);
        }

        //урок 2
        System.out.println(" ");
        System.out.println("Урок 2");
        System.out.println("Задача 1");
        int savings = 15000;
        double percent1 = 1D / 100;
        int general = 0;
        int month = 0;
        int needSave = 2459000;
        while (general < needSave) {
            general += savings;
            general = (int) (general * (1 + percent1));
            month++;
            System.out.println("Месяц  " + month + ", сумма накоплений равна " + general + " рублей.");
        }

        System.out.println(" ");
        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start += 1;
        }
        System.out.println();
        for (start = 10; start >= 1; start--) {
            System.out.print(start + " ");
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задача 3");
        int size = 12000000;
        int birtRate = 17;
        int mortalityRate = 8;
        int ratio = 1000;
        int yearOne = 2025;
        for (int year = yearOne; year < yearOne + 10; year++) {
            size += size * birtRate / ratio - size * mortalityRate / ratio;
            System.out.println("Год " + year + ", численность населения составляет " + size);
        }

        System.out.println(" ");
        System.out.println("Задача 4");
        int initially = 15000;
        double percent = 7D / 100;
        general = initially;
        month = 0;
        while (general < size) {
            general = (int) (general * (1 + percent));
            month++;
            System.out.println("Месяц  " + month + ", сумма накоплений равна " + general + " рублей.");
        }

        System.out.println(" ");
        System.out.println("Задача 5");
        general = initially;
        month = 0;
        while (general < size) {
            general = (int) (general * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц  " + month + ", сумма накоплений равна " + general + " рублей.");
            }
        }

        System.out.println(" ");
        System.out.println("Задача 6");
        percent = 7D / 100;
        month = 0;
        general = initially;
        int amountMonth = 12 * 9;
        while (month < amountMonth) {
            general = (int) (general * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц  " + month + ", сумма накоплений равна " + general + " рублей.");
            }
        }

        System.out.println(" ");
        System.out.println("Задача 7");
        int friday = 2;
        for (int day = friday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница , " + day + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println(" ");
        System.out.println("Задача 8");
        int repeated = 79;
        int beginning = 0;
        int lasts = yearOne - 200;
        int nearests = yearOne + 100;
        for (int year = beginning; year < nearests; year += repeated) {
            if (year > lasts) {
                System.out.println(year);
            }
        }
    }
}