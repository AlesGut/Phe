public class MathOperations {


    public static void main(String[] args) {
        int sum = add(-13, -15); //Ввод переменных Сумма
        int subtract1 = subtract(20, 15);//Ввод переменных Вычитание
        int multiply1 = multiply(-106, -17); //Ввод переменных Умножение
        double divide1 = divide(-5, 2); //Ввод переменных Деление
        int max = findMax((int) -10.3123,(int)100.2332 );// 2. Ввод переменной нахождение наибольшего числа
        int difference1 = difference(-10, -80); //3. Ввод переменных Модуль разницы
        int side = squareArea(9999);// 4. Ввод переменной Методы для площади  квадрата
        int length = squarePerimeter(-477);// 4. Ввод переменной Методы для периметра квадрата
        int minutes = (int) convertSecondsToMinutes(-120);// 5.Ввод переменной Метод для перевода секунд в минуты
        double speed = averageSpeed(100, -3); // 6. Ввод переменной Метод для вычисления средней скорости
        double hypotenuse = findHypotenuse(12, 2); //7.Ввод переменной Метод для нахождения гипотенузы
        float circumference = circleCircumference(2); //8. Ввод переменной Метод для длины окружности
        double percent = calculatePercentage(3, 10000); //9.Ввод переменной Метод для вычисления процентов
        double far = celsiusToFahrenheit(-100.45345); //10. Ввод переменной перевод в Фаренгейты
        double cel = fahrenheitToCelsius(1000);//10. Ввод переменной перевод в Цельсий



        System.out.println("1.возвращает сумму двух чисел " + sum); // Вывод Суммы
        System.out.println("1.возвращает разницу двух чисел " + subtract1); // Вывод Вычитания
        System.out.println("1.возвращает произведение двух чисел " +multiply1); // Вывод Умножения
        System.out.println("1.возвращает деление двух чисел " + divide1); // Вывод Деление
        System.out.println(" 2.Максимум " + max); //2. Вывод Нахождение максимума
        System.out.println(" 3.Модуль разницы " + difference1); //3. Вывод Модуль разницы
        System.out.println(" 4.Площадь " + side);// 4. Вывод Методы для площади квадрата
        System.out.println(" 4.Периметр " + length);// 4. Вывод Методы для периметра квадрата
        System.out.println(" 5.Минуты " + minutes); // 5.Вывод Метод для перевода секунд в минуты
        System.out.println(" 6.Средняя скорость " + speed);// 6.Вывод  Метод для вычисления средней скорости
        System.out.println(" 7.гипотенуза " + hypotenuse);// 7.Вывод гипотенузы
        System.out.println(" 8.длина окружности " + circumference);//8. Вывод переменной Метод для длины окружности
        System.out.println(" 9.процент от числа " + percent);// 9.Вывод Метод для вычисления процентов
        System.out.println(" 10.Фаренгейты " + far);//10. Вывод переменной перевод в Фаренгейты
        System.out.println(" 10.Цельсий " + cel); //10. Вывод переменной перевод в Цельсий


    }

    public static int add(int x, int y) {  // метод Суммы
        return (x + y);
    }

    public static int subtract(int x, int y) {//метод Вычитания
        return (x - y);
    }

    public static int multiply(int x, int y) {//метод Умножения
        return (x * y);
    }

    public static double divide(int x, int y) {//метод Деления
        if (y == 0) {
            return 9999999;
        } else {

            return ((double) x / y);
        }
    }

    public static int difference(int x, int y) { //3 Метод Модуль разницы
        return Math.abs(x - y); //Обработка модуль
    }

    public static int squareArea(int x) {// 4. Метод Методы для площади  квадрата
        int a;
        return a = x * x;
    }

    public static int squarePerimeter(int side) {// 4. Метод Методы для периметра квадрата
        return Math.abs(side * 4); // Модуль + вычисление периметра
    }

    public static float convertSecondsToMinutes(int x) { //5. Метод для перевода секунд в минуты
        return Math.abs(x / 60);
    }

    public static double averageSpeed(double distance, double time) {// 6. Метод для вычисления средней скорости
        if (time == 0) {//Обработка исключения деления на 0
            return 9999999;
        } else {

            return Math.abs(distance / time);
        }

    }

    public static double findHypotenuse(double a, double b) { //7. Метод для нахождения гипотенузы
        //return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return Math.round(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) * 1000.0) / 1000.0; //Корень 3 знака после запятой
    }

    public static float circleCircumference(float radius) { //8.Метод для длины окружности
        return (float) (Math.PI * 2 * radius);
    }

    public static double calculatePercentage(double total, double part) {// 9. Метод для вычисления процентов
        if (part == 0) {   //Обработка исключения деления на 0
            return 9999999;
        } else {

            return (total / part) * 100;
        }
    }

    public static double celsiusToFahrenheit(double c) { //10. Метод перевод в Фаренгейты
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {//10. Метод перевод в Цельсий
        return Math.round(((f - 32) * 5 / 9) * 1000.0) / 1000.0; //Вычисления Цельсия + округление до 3х знаков
    }

    public static int findMax(int a, int b) {
        //return Math.max(a, b); можно и так
        if (a <= b) {
            return b;
        } else {
            return a;
        }
    }
}

