package practice_4_dz;

import java.util.Scanner;

public class ForTaskDz {
    public static void main(String[] args) {
        //from1To100();//1. Вывод чисел от 1 до 100, делящихся на 3
        //sumNumbers();//2. Сумма чисел от 1 до n
        //multiplicationTable();//3. Таблица умножения для числа
        //System.out.println(primeNumber());//4. Проверка на простое число
        //ounNumber();//5. Вывод чисел от 1 до 10
    }

    public static void from1To100() {
        int i;
        for (i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void sumNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void multiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int a = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "*" + i + "=" + i * a);
        }
    }

    public static boolean primeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        boolean b = true;
        int a = scanner.nextInt();
        for (int i = 2; i <= a - 1; i++) {
            if (a % i == 0) {
                b = false;

            }
        }
        return b;
    }

    public static void ounNumber() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}