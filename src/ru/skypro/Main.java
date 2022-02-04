package ru.skypro;
public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task4() {
        var word="";
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                word = " ping";
            }
            if (i%5 == 0) {
                word = word+" pong";
            }
           System.out.println(i+":"+word);
           word="";
        }
    }
    public static void task5() {
        int numberFirst=0;
        int numberSecond=1;
        int numberCurrent;
        int i=3;
        var numbers=numberFirst+" "+numberSecond;
        while (i <= 10){
            numberCurrent = numberFirst + numberSecond;
            numberFirst = numberSecond;
            numberSecond = numberCurrent;
            numbers += " " + numberCurrent;
            i = i + 1;
        }
         System.out.println(numbers);
    }
    public static void task6() {
        int age=19;
        int salary=58_000;
        int limit;
        if (age>=23) {
            limit=salary*3;
        }
        else {
            limit=salary*2;
        }
        if (salary>=80_000){
            limit*=1.5;
        } else if (salary>=50_000) {
            limit *= 1.2;
        }
        System.out.println("Мы готовы выдать Вам кредитную карту с лимитом "+limit+" рублей");
    }
    public static void task7() {
        int age=25;
        double salary=60_000;
        double wantedSum=330_000;
        double baseRate=10;
        double maxMonthlyPayment=salary*0.5;
        double payment;
        var word="";
        if (age<23) {
            baseRate += 1;
        } else if (age<30) {
            baseRate +=0.5;
        }
        if (salary >80_000) {
            baseRate -=0.7;
        }
        payment=wantedSum*baseRate/100;
        //в задаче условие только меньше или больше, предположу,что при равенстве одобряем
        if (payment<=maxMonthlyPayment) {
            word = "Одобрено";
        } else {
            word = "Отказано";
        }
       System.out.print("Максимальный палатеж при зарплате "+salary +" равен " + maxMonthlyPayment +" рублей. Платеж по кредиту "+payment +" рублей. " +word );
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
