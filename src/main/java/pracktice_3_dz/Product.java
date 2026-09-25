package pracktice_3_dz;

public class Product {
    String name;
    double price;

    Product(double somePrice, String someName) {
        this.name = someName;
        this.price = somePrice;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    void printInfo() {
        System.out.println("Название товара " + getName() + " , Цена товара " + getPrice());
    }

    void applyDiscount(double discount) {
        this.price = (1 - (discount / 100)) * this.price;
    }
}
