package practice_4_if_for.solvers;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTaskSolwer {
    public static void main(String[] args) {
        //проверка метода по угадыванию рандомного числа
        // findNumber();
        //проверка метода по поиску минимального введенного числа
        //findMin();
        //проверка метода по введению пароля и логина
        checkCredentials();
    }

    public static void findNumber() {
        Scanner scanner = new Scanner(System.in);
        int random = new Random().nextInt(5);
        int number;
        System.out.println("Угадайте число");
        do {
            number = scanner.nextInt();
        } while (number != random);
        System.out.println("Верно");
    }

    public static void findMin() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int min = 213;
        do {
            System.out.println("Введите число: ");
            number = scanner.nextInt();
            if (number < min && number >= 0) min = number;
        } while (number >= 0);
        System.out.println("Минимальное число:" + min);
    }

    public static void checkCredentials() {
        Scanner scanner = new Scanner(System.in);

        String logon;
        String password;

        do {
            System.out.println("Введите логин: ");
            logon = scanner.nextLine();
            System.out.println(("Введите пароль: "));
            password = scanner.nextLine();
        } while (!logon.equals("admin") || !password.equals("123"));

        System.out.println("Доступ разрешен. ");
    }
}

