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
        int salary2 = 29000;
        int amount2 = 0;
        for (int month2 = 1; month2 <= 12; month2++) {
            amount2 = amount2 + amount2 / 100;
            amount2 = amount2 + salary2;
            System.out.println("Месяц  " + month2 + ", сумма накоплений равна " + amount2 + " рублей.");
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
        while (general < 2459000) {
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
            start = start + 1;
        }
        System.out.println();
        for (start = 10; start >= 1; start--) {
            System.out.print(start + " ");
        }

        System.out.println(" ");
        System.out.println("Задача 3");
        int size = 12000000;
        float birtRate = (float) 17.0 / 1000;
        float mortalityRate = (float) 8.0 / 1000;
        int year = 1;
        while (year < 10) {
            float birtRate1Year = (int) (size * birtRate);
            float mortalityRate1Year = (int) (size * mortalityRate);
            size = (int) (size + birtRate1Year - mortalityRate1Year);
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + size);
        }

        System.out.println(" ");
        System.out.println("Задача 4");
        int initially = 15000;
        double percent = 7D / 100;
        int general1 = 0;
        general1 = initially;
        int month1 = 0;
        while (general1 < 12000000) {
            general1 = (int) (general1 * (1 + percent));
            month1++;
            System.out.println("Месяц  " + month1 + ", сумма накоплений равна " + general1 + " рублей.");
        }

        System.out.println(" ");
        System.out.println("Задача 5");
        general1 = initially;
        month1 = 0;
        while (general1 < 12000000) {
            general1 = (int) (general1 * (1 + percent));
            month1++;
            if (month1 % 6 == 0) {
                System.out.println("Месяц  " + month1 + ", сумма накоплений равна " + general1 + " рублей.");
            }
        }

        System.out.println(" ");
        System.out.println("Задача 6");
        percent = 7D / 100;
        general1 = 0;
        general1 = initially;
        month1 = 0;
        while (month1 < 12 * 9) {
            general1 = (int) (general1 * (1 + percent));
            month1++;
            if (month1 % 6 == 0) {
                System.out.println("Месяц  " + month1 + ", сумма накоплений равна " + general1 + " рублей.");
            }
        }

        System.out.println(" ");
        System.out.println("Задача 7");
        int friday = 2;
        for (int day = friday; day <= 31; day += 7) {
            System.out.println("Сегодя пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println(" ");
        System.out.println("Задача 7");
        int cicle = 79;
        int seen = 0;
        int year1 = 2024;
        int start1 = year1 - 200;
        int start2 = year1 + 100;
        for (int year2 = seen; year2 < start2; year2 += cicle) {
            if (year2 > start1) {
                System.out.println(year2);
            }
        }
    }
}