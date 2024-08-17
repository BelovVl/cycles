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
    }
}