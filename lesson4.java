package level1.lesson4;

import java.util.Random;
import java.util.Scanner;

public class lesson4 {

    //        создать переменные размера поля, символ пустого поля, символ игрока и ИИ
    public static char [][] field;
    public static final int SIZE = 5;


    public static final char DOT_PLAYER = 'X';
    public static final char DOT_AI = 'O';
    public static final char DOT_EMPTY = '.';
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();



    public static void initField () {
        field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printField () {
        for (int i = 0; i < SIZE; i++) {
            if (i == 0) {
                System.out.print("    " + (i + 1) + "   ");
            } else {
                System.out.print((i + 1) + "   ");
            }
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void setSymb (int x, int y, char symb) {
        field [x][y] = symb;
    }

    public static void turnPlayer () {
        int x, y;
        do {
            System.out.println("Введите координаты желаемой ячейки в формате X и Y");
            x = scanner.nextInt()-1;
            y = scanner.nextInt()-1;

        } while (!isValueCell(x,y));
        setSymb(x, y, DOT_PLAYER);
    }

    public static void turnAI () {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isValueCell(x,y));
        setSymb(x, y, DOT_AI);
    }

    public static boolean isFieldFull () {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

//    метод проверки ячейки поля на возможность заполнения
    public static boolean isValueCell (int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        return  (field [x][y] == DOT_EMPTY);
    }

// метод проверки выигрыша по диагонали
    public static boolean checkDiagonal (char symb) {
        boolean straight = true;
        boolean reverse = true;

        for (int i = 0; i < SIZE; i++) {
            straight &= (field[i][i] == symb);
            reverse &= (field[SIZE-i-1][i] == symb);
        }

        if (straight || reverse) return true;

        return false;
    }
    // метод проверки выигрыша по горизонтали или вертикали
    public static boolean checkLines (char symb) {
        boolean rows;
        boolean columns;

        for (int i = 0; i < SIZE; i++) {
            rows = true;
            columns = true;
            for (int j = 0; j < SIZE; j++) {
                columns &= (field[i][j] == symb);
                rows &= (field[j][i] == symb);
            }
            if (rows || columns) return true;
        }
        return false;
    }

    public static void main (String[] args) {
        initField();
        printField();

        while (true) {
            turnPlayer();
            printField();



            if (checkDiagonal(DOT_PLAYER)) {
                System.out.println("вы выиграли!!");
                break;
            }

            if (checkLines(DOT_PLAYER)) {
                System.out.println("вы выиграли!!");
                break;
            }

            if (isFieldFull()) {
                System.out.println("Ничья");
                break;
            }

            turnAI();
            printField();


            if (checkDiagonal(DOT_AI)) {
                System.out.println("Победил компьютор!!");
                break;
            }

            if (checkLines(DOT_AI)) {
                System.out.println("Победил компьютор!!");
                break;
            }

            if (isFieldFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("игра окончена");
    }
}
