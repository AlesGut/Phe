package practice_4_dz;

import java.util.Scanner;

public class WhileTaskDz {
    public static void main(String[] args) {
        //System.out.println("Факториал числа = " + factorialOut());//1. Вычисление факториала с помощью while
        //evenNumber();//2. Вывод всех чётных чисел до заданного
        mumberBelowOut();//3. Обратный отсчёт от введённого числа до 1

    }

    public static int factorialOut() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = scanner.nextInt();
        int i = 1;
        int factorial = 1;
        while (i <= number) {
            factorial = factorial * i;
            i++;
        }
        return factorial;
    }

    public static void evenNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int num = scanner.nextInt();
        int i = 2;
        System.out.println("Четные числа от 1 до заданного :");
        while (i <= num) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }

    public static void mumberBelowOut() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int i = scanner.nextInt();
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}
