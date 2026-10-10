package practice_4_dz;

import java.util.Scanner;

public class DoWhileDz {
    public static void main(String[] args) {
        // requestForNumber();// 1. Запрос положительного числа
        //checkPasswod();//2. Проверка пароля
        //outNumber(); //3. Вывод чисел от 1 до 10 с использованием do-while
        // outExit();//4. Завершение программы по команде "exit"
        numberCount(); // 5. Подсчёт количества цифр в числе
    }

    public static void requestForNumber() {
        Scanner scanner = new Scanner(System.in);

        int num;

        do {
            System.out.println("Введите число ");
            num = scanner.nextInt();

        } while (!(num >= 0));
        System.out.println(num);
    }

    public static void checkPasswod() {
        Scanner scanner = new Scanner(System.in);
        String login;
        String pass;
        do {
            System.out.println("Введите логин и пароль");
            login = scanner.next();
            pass = scanner.next();
        } while (!(login.equals("admin")) || !(pass.equals("000000")));
        System.out.println("Вход выполнен");
    }

    public static void outNumber() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void outExit() {
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.println("Программа работает, введите команду");
            command = scanner.nextLine();
        }
        while (!(command.equals("exit")));
        System.out.println("Программа завершила работу");
    }

    public static void numberCount() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 0;
        do {
            num = Math.abs(num) / 10;
            i++;
        } while (num >= 1);
        System.out.println("В числе " + i + " цифр(а)");
    }
}

