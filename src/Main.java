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
        int allCash = 2_459_000;
        while (total < allCash) {
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
        for (int a = 10; a >= 1; a = a - 1) {
            System.out.print(" " + a);

        }
        System.out.println();
    }


    public static void task3() {
        System.out.println("task 3");
        int countryPeople = 12_000_000;
        int born = 17;
        int death = 8;
        for (int year = 1; year <= 10; year++) {
            countryPeople += (countryPeople / 1000) * (born - death);
            System.out.println("year " + year + " people in country equally " + countryPeople);

        }
    }


    public static void task4() {
        System.out.println("task 4");
        int percent =7;
        double salary = 15000;
        int target  = 12_000_000;
        int month = 0;
        for (; salary < target; month++) {
            salary += salary/100*percent;

            System.out.println("Месяц " + month + " Итого " + salary);

        }

    }

    public static void task5() {
        System.out.println("task 5");
        int percent = 7;
        double salary = 15000;
        double total = 0;
        int month = 0;
        int allCash = 12_000_000;
        while ( total < allCash) {
            total += total * percent / 100;
            total = total + salary;
            if (month % 6 == 0) {


                System.out.println("Месяц " + month + " Итого " + total);

            }

        }
    }


        public static void task6 () {
            System.out.println("task 6");
            int percent = 7;
            int years = 9;
            double salary = 15000;
            int target  = 12_000_000;

            for (int month = 0; salary < target; month++) {
                salary += salary/100*percent;
                month = years * 12;
                System.out.println(salary);

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


