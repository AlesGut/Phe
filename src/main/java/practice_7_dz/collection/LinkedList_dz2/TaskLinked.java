package practice_7_dz.collection.LinkedList_dz2;

import java.util.LinkedList;

public class TaskLinked {
    LinkedList<String> taskList;

    public TaskLinked() {
        this.taskList = new LinkedList<>();
    }

    public void addTask(String value) {
        taskList.add(value);
    }


    public void processingTaskList(){
        System.out.println(taskList.remove());
    }
}
