public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("task 1");
        int cash = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            month = total / cash;
            total = total + cash;
            System.out.println("month " + month + " the amount of savings is equal to " + total + " RUB!");
        }
    }

    public static void task2() {
        System.out.println("task 2");

        int i = 1;
        while (i < 11) {

            System.out.print(" " + i);
            i = i + 1;
        }
        System.out.println();
        for (int a = 10; a <= 10 && a >= 1; a = a - 1) {
            System.out.print(" " + a);

        }
    }


    public static void task3() {
        System.out.println("task 3");
        int countryPeople = 12_000_000;
        int born = 17;
        int death = 8;
        for (int i = 1; i <= 10; i++) {
            countryPeople += (countryPeople / 1000) * (born - death);
            System.out.println("year " + i + " people in country equally " + countryPeople);

        }
    }


    public static void task4() {
        System.out.println("task 4");
        double salary = 15000;
        double total = 0;
        int i = 0;
        for (; total < 12_000_000; i++) {
            total = total + salary * 1.07;

            System.out.println("Месяц " + i + " Итого " + total);

        }

    }

    public static void task5() {
        System.out.println("task 5");
        int percent = 7;
        double salary = 15000;
        double total = 0;
        int month = 0;
        while ( total < 12_000_000) {
            total += total * percent / 100;
            total = total + salary;
            if (month % 6 == 0) {


                System.out.println("Месяц " + month + " Итого " + total);

            }
            System.out.println(total);
        }
    }


        public static void task6 () {
            System.out.println("task 6");
            int percentMonth = 7;
            double cash = 15000;
            int nineYearInMonth = 108;
            int month = 0;
            while ( month <= nineYearInMonth ) {
                cash += cash * percentMonth / 100;

                if (month % 6 == 0) {
                    System.out.println("month " + month + " your cash " + cash);
                }
                System.out.println(cash);
            }
        }


        public static void task7 () {
            System.out.println("task 7");
            int friday = 5;
            int dayInMonth = 31;

            for (; friday <= dayInMonth; friday += 7) {
                System.out.println("now is friday " + friday + " number.Need prepare a report!");
            }
        }


        public static void task8 () {
            System.out.println("task 8");
            int period = 79;
            int yearNow = 2023;
            int after = yearNow + 100;
            int before = yearNow - 200;

            for (int year = 0; year <= after; year += period) {
                if (year > before) {
                    System.out.println(year);
                }
            }


        }
    }


