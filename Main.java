package level1;

public class Main {

    public static void main(String[] args) {
        // exercise 2
        byte by = 123;
        short s = 23456;
        int i = 234595;
        long l = 2340L;

        float f = 1.23f;
        double doub = 1.355904352;

        boolean bool = true;
        char ch = 'C';

        // exercise 3
        calculate(12, 21, 34,54);

        // exercise 4
//        System.out.println("Упражнение 4");
        sumCheck(12, 3);


        // exercise 5
        System.out.println("Упражнение 5");
        positiveOrNegative(240);

        // exercise 6
        isNegativ(-23);

        // exercise 7
        printGreetings("Саша");

        // exercise 8
        IsLeapYear( 2000);

    }

    //метод вычисляющий выражение a*(b+(c/d))и возвращающий результат

    public static int calculate (int a, int b, int c, int d) {

        return a * (b + (c/d));
    }
    /*
    метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
    пределахот10до20(включительно)
    */

    public static boolean sumCheck (int a, int b) {

        return (a+b) >=10 && (a+b)<=20;
    }

    //положительное ли число передали, или отрицательное

    public static void positiveOrNegative (int a) {
            System.out.println(a >= 0 ? "positive":"negativ");
    }

    // отрицательное ли число было передано
    public static boolean isNegativ (int a) {

        return (a < 0);
    }

    // а теперь давайте поздороваемся!!!

    public static void printGreetings (String name) {
        System.out.println("Привет, " + name);
    }

    // високосный ли год
    public static boolean IsLeapYear (int year) {
//        boolean check;
//        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400) == 0) {
//            check = true;
//            System.out.println(year + " год високосный");
//            System.out.println(check);
//        } else {
//            check = false;
//            System.out.println(year + " год не високосный");
//            System.out.println(check);
//        }
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400) == 0;
    }
}
