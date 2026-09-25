package pracktice_3_dz;

public class Rectangle {
    int width;
    int height;

    Rectangle(int someWidth, int someHeight) { // конструктор
        this.height = someHeight;
        this.width = someWidth;

    }

    int getWidth() {
        return this.width;
    }

    int getHeight() {
        return this.height;
    }

    void setWidth(int newWidth) { //Сеттер Width
        this.width = newWidth;
    }

    void сalculateArea() {
        System.out.println(this.width * this.height);
    }


}
