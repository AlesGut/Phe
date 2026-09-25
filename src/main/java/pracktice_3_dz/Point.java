package pracktice_3_dz;

public class Point {
    int x;
    int y;

    Point(int somX, int somY) {
        this.x = somX;
        this.y = somY;
    }

    int getPoint() {
        return this.x;
    }

    int getY() {
        return this.y;

    }

    void setX(int newX) {
        this.x = newX;
    }

    void print() {
        System.out.println("Значение x= " + getPoint() + ", Значение y= " + getY());
    }
}

