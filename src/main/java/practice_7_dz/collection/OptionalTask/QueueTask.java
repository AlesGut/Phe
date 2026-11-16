package practice_7_dz.collection.OptionalTask;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueTask {
    private Deque<String> taskList;

    public QueueTask() {
        this.taskList = new ArrayDeque<>();
    }

    public void addTask(String task) {
        taskList.add(task);
    }

    public void jobTask() {

        System.out.println(taskList.remove());
    }

    public void printAllTask() {
        for (String s : taskList) {
            System.out.println(s);
        }
    }
}
