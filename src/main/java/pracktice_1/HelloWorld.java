package pracktice_1;

public class HelloWorld {
    //Поля
    static int a = 1;

    //метод
    // зеленая трелочка программа запуска
    //метод main - точка входа в программу
    public static void main(String[] args) {
        System.out.println("Привет Мир!");
        System.out.println("Это Саша!");
        System.out.println(1 + 2);
        System.out.println(3 * 5);
        System.out.println("В поле а хранится: " + a);

        int sum1 = sum(12, 26);
        System.out.println(sum1);
        int mult1 = mulpiply(3, 2);
        System.out.println("Результат умнодения " + mult1);

        int subs1 = substruct(10, 3);

        System.out.println("результат вычитания " + subs1);
        double div1 =  divide(3, 2);
        System.out.println("результат деления "+div1);


    }

    public static int sum(int x, int y) {
        //Тело метода
        return x + y; // Возвращаемое значение из метода
    }

    public static int mulpiply(int p, int k) {// аргументы метода
        //тело метода
        int mult = p * k; // создала переменную, присвоила значения равное результату
        return mult;
    }

    public static int substruct(int g, int l) {
        return g - l;
    }

    // Возвращаемый тип данных - целое или нет? 3/2 = 1.5
    public static double divide(int s, int t) {
        return(double) s / t;
    }
}
