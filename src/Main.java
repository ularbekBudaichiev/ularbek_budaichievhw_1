import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hot weather");

        final int NUM = 18;

        String word = "Bishkek";

        System.out.println(NUM + word);
        System.out.println(NUM);
        System.out.println(word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        System.out.print("Введите ваше имя:");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Привет " + userName + "!");

        scanner.close();// final

    }
}


