public class UserInfo {// определение класса
    private static final String DEFALT_NAME = "unknown";
    private String name; // объявление поля класса с типом данных String и именем. name
    private int age;

    public void printInfo() {
        System.out.println("Имя: " + name); // Вызов распечатывания в консоль с новой строки с аргументом "Имя: ", конкатенированное с полем name
        System.out.println(" Возраст " + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) { //определение метода main (точка входа)
        UserInfo userInfo = new UserInfo();
        userInfo.setName("Олег");
        userInfo.setAge(21);
        userInfo.printInfo();


    }

}
