package practice_7_dz.collection.OptionalTask;

public class Main {
    public static void main(String[] args) {
       /* UserID userID = new UserID();
        userID.addUser(12, "Толик");
        userID.addUser(10, "Гога");
        userID.addUser(13, "Филимон");
        userID.addUser(14, "Настя");
        // userID.searсhUser(12);
        //userID.searсhUser(43);
        userID.printAllUser();*/

    QueueTask queueTask = new QueueTask();
    queueTask.addTask("Задача 1");
    queueTask.addTask("Задача 2");
    queueTask.addTask("Задача 3");
    queueTask.addTask("Задача 4");
    queueTask.addTask("Задача 5");
    queueTask.jobTask();
    queueTask.jobTask();
        System.out.println();
    queueTask.printAllTask();
        System.out.println();
    queueTask.jobTask();
}
}
