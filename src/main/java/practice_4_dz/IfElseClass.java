package practice_4_dz;

import java.util.Scanner;

public class IfElseClass {
    public static void main(String[] args) {
        //System.out.println(signOfTheNumber());// Определение знака числа
        //System.out.println(searchForTheLargest());// Определение наибольшего числа
        // System.out.println(assessmentConclusion()); // 3. Вывод оценки по шкале 1–5
        //System.out.println(checkParity()); //4. Проверка на чётность
        //System.out.println(discountDefinitio());// 5. Определение размера скидки по возрасту
        //System.out.println(checkResult()); // 6. Оценка результата теста по баллам
    }

    public static String signOfTheNumber() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a < 0) {
            return "Число отрицательное";
        } else if (a == 0) {
            return ("Число равно нулю");
        } else {
            return ("Число положительное");
        }
    }

    public static int searchForTheLargest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1");
        int a = scanner.nextInt();
        System.out.println("Введите число 2");
        int b = scanner.nextInt();

        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    public static String assessmentConclusion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку ");
        double a;
        a = scanner.nextInt();
        a = Math.abs(a);
        if (a == 5) {
            return "Отлично";
        } else if (a == 4) {
            return "Хорошо";
        } else if (a == 3) {
            return "Удовлетворительно";
        } else {
            return "Неудовлетворительно";
        }
    }

    public static String checkParity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        a = a % 2;
        if (a == 0) {
            return "Четное";
        } else {
            return "Нечетное";
        }
    }

    public static String discountDefinitio() {
        System.out.println("Введите возраст");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        a = Math.abs(a);
        if (a <= 18) {
            return "Скидка 25%";
        } else if (a >= 65) {
            return "Скидка 30%";
        } else {
            return "Без скидки";
        }
    }

    public static String checkResult() {
        System.out.println("Введите результат");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        a = Math.abs(a);
        if (a >= 90) {
            return "Отлично";
        } else if
        (a >= 75 && a <= 89) {
            return "Отлично";
        } else if (a >= 60 && a <= 74) {
            return "Удовлетворительно";
        } else {
            return "Неудовлетворительно";
        }


    }
}

