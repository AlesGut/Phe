package practice_7_dz.collection.LinkedList_dz2;

public class Main {
    public static void main(String[] args) {
        TaskLinked taskLinked = new TaskLinked();
        taskLinked.addTask("Убраться в комнате");
        taskLinked.addTask("Напечатать деталь на 3D принтере");
        taskLinked.addTask("Поесть");
        taskLinked.processingTaskList();
        taskLinked.processingTaskList();
        taskLinked.processingTaskList();
        // taskLinked.processingTaskList();
    }
}
