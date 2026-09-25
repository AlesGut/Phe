package pracktice_3_dz;

public class Car {
    String brand;
    int year;

    Car(String someBrend, int someYear) {   //Конструктор
        this.year = someYear;
        this.brand = someBrend;
    }

    ;

    void setBrand(String newBrend) { // сеттер Brend
        this.brand = newBrend;
    }

    void setYear(int newYear) {   // сеттер  Year
        this.year = newYear;
    }

    String getBrand() {    // геттер Brand
        return this.brand;
    }

    int getYear() {       // геттер Year
        return this.year;
    }

    void print() {
        System.out.println("Беренд авто " + getBrand() + ", Возраст " + getYear());
    }
}
