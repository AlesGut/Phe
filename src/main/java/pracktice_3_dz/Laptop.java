package pracktice_3_dz;

public class Laptop {
    String brand;
    double price;

    Laptop(String someBrand, double somePrice) {
        this.brand = someBrand;
        this.price = somePrice;
    }

    double getPrice() {
        return this.price;

    }

    String getBrand() {
        return this.brand;
    }

    void setBrand(String newBrand) {
        this.brand = brand;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    void printInfo() {
        System.out.println("Название бренда " + getBrand() + ", Цена " + getPrice() + " руб.");
    }
}
