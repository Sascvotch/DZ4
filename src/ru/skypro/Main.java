package ru.skypro;
public class Main {

    public static void main(String[] args) {

        task1();
        task2();
        task3();

    }

    public static void task1() {
        int i = 0;
        while (i < 10) {
            i=i+1;
            System.out.print(i+" ");
        }
        System.out.println();
        for (;i>=1;i--) {
            System.out.print(i+" ");
        }
    }
    public static void task2() {
        System.out.println();
        int fridayMonth = 1;
        while (fridayMonth<=31) {
              System.out.println("Сегодня пятница, "+fridayMonth+"-е число. Необходимо подготовить отчет.");
              fridayMonth+=7;
        }
    }
    public static void task3() {
        int currentYear = 2022;
        int beginYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int year = beginYear; year <= endYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);

            }
        }
    }
    }
