package pracktice_3_dz;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", 10);//1 Объект Автомобили
        //car1.print();
        car1.setYear(100);
        car1.print();
        //System.out.println(car1.getYear() + " Конец 1го задания");

        Rectangle rectangle1 = new Rectangle(20, 10); //2 Объект прямоугольник
        //System.out.println(rectangle1.getWidth());
        rectangle1.setWidth(13);
        rectangle1.сalculateArea();
        System.out.println("Ширина " + rectangle1.getHeight() + " Высота " + rectangle1.getWidth());
        //System.out.println("Конец 2го задания");

        Book book1 = new Book("Rieng", "Kolva");//задание 3 Объект  Книга
        //book1.printInfo();
        book1.setAuthor("Alex");
        // book1.setTitle("The Guardian");
        book1.printInfo();
        // System.out.println("Конец 3-тьего задания");


        BankAccount account1 = new BankAccount("Nikita", 90000);//задание 4 Объект  Аккаунт
        //account1.printBalance();
        account1.deposit(15); //Внесение баланса
        //account1.printBalance();
        account1.withdraw(1000); //Вывод  средств с баланса
        account1.printBalance();  //Вывод текущего баланса
        // System.out.println("Конец 4-тьего задания");


        Point point1 = new Point(13, 14);//задание 5 Объект  координаты
        //point1.print();
        point1.setX(16);
        point1.print();
        //  System.out.println("Конец 5-тьего задания");


        StudentGroup studentGroup1 = new StudentGroup("СМ 8", 35); //задание 6 Объект  Студенты
        //studentGroup1.printInfo();
        studentGroup1.setStudentCount(30);
        studentGroup1.printInfo();
        // System.out.println("Конец 6-тьего задания");


        Circle circle1 = new Circle(100); //задание 7 Объект  Окружность
        circle1.setRadius(9);
        System.out.println("Площадь = " + circle1.calculateArea() + " , Длина окружности = " + circle1.calculateCircumference());
        //System.out.println("Конец 7-тьего задания");

        Teacher teacher1 = new Teacher("Nikolay", "Mathematics");//задание 8 Объект  Предметы
        teacher1.setSubject("Биология");
        teacher1.printInfo();
        // System.out.println("Конец 8-тьего задания");


        Product product1 = new Product(20, "Apple"); //задание 9 Объект  Товар со скидкой
        product1.setPrice(40); // изменяем цену товара
        product1.applyDiscount(50);  // применяем скидку
        product1.printInfo();    // выводим цену и название товара
        //  System.out.println("Конец 9-тьего задания");


        Laptop laptop1 = new Laptop("Lenovo", 1459);
        laptop1.setPrice(2000);
        laptop1.printInfo();
    }
}
