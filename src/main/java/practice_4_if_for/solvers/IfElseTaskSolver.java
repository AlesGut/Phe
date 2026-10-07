package solvers;

public class IfElseTaskSolver {
    public static void main(String[] args) {


        /**
         * Метод для проверки четности числа
         *
         * @param number
         * @return
         */

        //Проверка метода четности
        System.out.println(checkParity(5));
        //Проверка метода определения возроста
        System.out.println(checkAge(4));
        System.out.println(checkAge(21));
        System.out.println(checkAge(71));
        // проверка метода по нахождению max среди 3х чисел
        System.out.println(checkMax(3, 5, 10));


    }

    public static String checkParity(int number) {
        // if - else
        // number % 2 == 0 -> Четное
        // number % 2== 1  -> Нечетное
        // number  =2; -> 2 % 2 == 0 Четное
        // number  =7; -> 2 % 2 == 1 Нечетное
        // % - Показывает остаток при делении
        // Всегда должен быть 1 return
        String parity = "Нечетное";
        if (number % 2 == 0) {
            return parity = "Четное";

        }
        return parity;
    }


    public static String checkAge(int age) {
        String ageDiscription = "";
        if (age < 18) {
            ageDiscription = "Несовершеннолетний";
        }
        if (age >= 18 && age <= 60) {
            ageDiscription = "Взрослый";
        }
        if (age > 60) {
            ageDiscription = "Пожилой";
        }
        return ageDiscription;
    }

    //  метод по нахождению max среди 3х чисел
    public static int checkMax(int a, int b, int c) {
        int maxAB = b;
        if (a > b) {
            maxAB = a;
        }
        int max = maxAB;
        if (c > maxAB) {
            max = c;
        }
        return max;

    }


}