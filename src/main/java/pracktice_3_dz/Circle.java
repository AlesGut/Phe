package pracktice_3_dz;

public class Circle {
    int radius;

    Circle(int somRadius) {
        this.radius = somRadius;
    }

    int getRadius() {
        return radius;
    }

    void setRadius(int newrRadius) {
        this.radius = newrRadius;
    }

    double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    double calculateCircumference() {
        return Math.PI * this.radius * 2;
    }

}
