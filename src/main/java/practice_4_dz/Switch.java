package practice_4_dz;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //System.out.println(conclusionOfTheDay());// 1. Вывод дня недели по номеру
        // System.out.println(ticketPrice());// 2. Стоимость билета по дню недели
        //System.out.println(translationOfNumericalEstimates());// 3. Перевод числовых оценок в буквенные (A–F)
        //System.out.println(processingTextCommands()); // 4. Обработка текстовых команд
        System.out.println(сalculator());//5. Простой калькулятор с использованием switch

    }

    public static String conclusionOfTheDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение");
        int a = scanner.nextInt();
        String day;
        switch (a) {
            case 1:
                day = "Понедельник";
                break;
            case 2:
                day = "Вторник";
                break;
            case 3:
                day = "Среда";
                break;
            case 4:
                day = "Четверг";
                break;
            case 5:
                day = "Пятница";
                break;
            case 6:
                day = "Суббота";
                break;
            case 7:
                day = "Воскресенье";
                break;
            default:
                day = " Некорректное значение";
        }
        return day;
    }

    public static String ticketPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день ");
        int day = scanner.nextInt();
        String money;
        switch (day) {
            case 1, 2, 3, 4, 5:
                money = "300 рублей";
                break;
            case 6, 7:
                money = "450 рублей";
                break;
            default:
                money = "Некорректное значение";
                break;
        }
        return money;

    }

    public static String translationOfNumericalEstimates() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку");
        int a = scanner.nextInt();
        String estimation;
        if (a < 60) {
            estimation = "F";
        } else if (a >= 60 && a <= 69) {
            estimation = "D";
        } else if (a >= 70 && a <= 79) {
            estimation = "C";
        } else if (a >= 80 && a <= 89) {
            estimation = "B";
        } else if (a >= 90 && a <= 100) {
            estimation = "A";
        } else {
            estimation = "Некорректное значение";
        }


        return estimation;
    }

    public static String processingTextCommands() {
        System.out.println("Введите команду");
        Scanner scanner = new Scanner(System.in);

        String in = scanner.nextLine();
        String out = "";
        switch (in) {
            case "start" -> out = "Система запущена";
            case "stop" -> out = "Система остановлена";
            case "restart" -> out = "Система перезапущена";
            case "status" -> out = "Система исправна";
            default -> out = "Некорректное значение";

        }
        return out;
    }

    public static double сalculator() {

        Scanner scanner = new Scanner(System.in);
        // System.out.println("Введите значение a");
        int a = scanner.nextInt();
        System.out.println("Введите значение b");
        int b = scanner.nextInt();
        System.out.println("Введите знак");
        String sign = scanner.next();
        double result;
        switch (sign) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = (double) a / b;
                break;
            default:
                result = 0;

        }
        return result;
    }
}