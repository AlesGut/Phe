package practice_4_if_for.solvers;

public class ForTaskSolver {
    public static void main(String[] args) {
        // проверка таблицы умножения для числа
        multiplyTable(6);
        // проверка суммы чисел (Арифм прогр)
        System.out.println(sumOfAllNumber(3));
        // проверка метода по определению простого числа
        System.out.println(checkNumbersIsSimple(3));
        System.out.println(checkNumbersIsSimple(8));
    }

    public static void multiplyTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }

    // метод сумма всех чисел заданного числа
    public static int sumOfAllNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static boolean checkNumbersIsSimple(int number) {
        //простое число, число которое делится только на себя и на 1
        boolean isSimple = true;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                isSimple = false;
                break;
            }
        }

        return isSimple;
    }


}
