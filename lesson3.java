package level1.lesson3;



import java.util.Random;
import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
/*        1е задание

        System.out.println("Добро пожаловать в игру! Тебе нужно угадать число от 0 до 9. Поехали!");
        guessNumber();

        for (int i =0;;i++) {
            System.out.println("Хочешь повторить игру? 1 - да, 0 - нет");
            Scanner scanner = new Scanner(System.in);
            int newGame = scanner.nextInt();
            if (newGame == 1) {
                guessNumber();
            }
            else {
                System.out.println("bye");
                break;
            }
        }
*/
        System.out.println("Давайте начнем игру, вам нужно угадать продукт!");
        guessWord();
    }

    public static void guessNumber () {
        int answer = (int) (Math.random()*10);
        for (int i = 0;  i<3; i++) {
            System.out.println("Введите ваше число");
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();
            if (guess == answer) {
                System.out.println("Верно! Поздравляю!");
                break;
            } else if (guess < answer) {
                System.out.println("Загаданное число больше!");
            } else {
                System.out.println("Загаданное число меньше");
            }
            if (i == 2)System.out.println("К сожалению ты проиграл");
        }
    }

    public static void guessWord () {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String random = words[new Random().nextInt(words.length)];

        for (int j = 0; ; j++) {

            System.out.println("ваш ответ");
            Scanner scanner = new Scanner(System.in);
            String guess = scanner.nextLine();

            if (guess.equals(random)) {
                System.out.println("Bingo! Ты угадал!");
                break;

            } else {
                for (int i = 0; i < 15; i++) {
                    if (i > random.length() - 1 || (i > guess.length() - 1) || guess.charAt(i) != random.charAt(i) ) {
                        System.out.print("#");
                    } else {
                        System.out.print(random.charAt(i));
                    }
                }
            }
        }
    }
}
