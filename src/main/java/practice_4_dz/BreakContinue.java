package practice_4_dz;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        //simNum(); //  1. Сумма чисел до первого отрицательного (использовать break)
        //skippingNumbers3(); // 2. Пропуск чисел, делящихся на 3 (использовать continue)
        //outputPositiveNumbers();//3. Вывод только положительных чисел (использовать continue)
        outStop();//4. Ввод строк до команды "stop" (использовать break)
    }

    public static void simNum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Введите число");
            int num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            sum = num + sum;
        }
        System.out.println("Сумма равна " + sum);
    }

    public static void skippingNumbers3() {


        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void outputPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int num;
        while (i <= 4) {
            System.out.println("Введите число");
            num = scanner.nextInt();
            if (num < 0) {
                i++;
                continue;
            }
            i++;
            System.out.println(num);

        }
    }

    public static void outStop() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите команду");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                System.out.println("Программа остановлена");
                break;
            }
        }

    }

}
