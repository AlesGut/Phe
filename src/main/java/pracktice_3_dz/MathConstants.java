package pracktice_3_dz;

public class MathConstants {


    final double PI = 3.14159;
    final double E = 2.71828;

    static MathConstants constants = new MathConstants(); // создание объекта класса

    double getE() {  //геттер плоя E
        return E;
    }

    public double getPI() { //геттер поля PI
        return PI;
    }

    static void calculateCircleArea(double r) {  // площадь круга
        System.out.println(Math.pow(r, 2) * constants.getPI());


    }

    static void calculateExponentialGrowth(double initialValue, double rate, double time) { //Расчет по странной формуле
        System.out.println(initialValue * Math.pow(constants.getE(), rate * time));
    }

    //  static double calculateCircumference(double r) { //длина окружности}
    // }
}