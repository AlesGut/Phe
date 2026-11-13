package practice_7_.cost.PhotoEditor;

import java.util.Stack;

public class PhotoEditor {
    // хранить последние действия
    private Stack<String> actions;

    public PhotoEditor() {
        this.actions = new Stack<>();
    }

    // добавление нового действия
    public void addNewAction(String action) {
        actions.push(action);
    }

    public void undoLastAction() {
        actions.pop();
    }

    public void printActions() {
        System.out.println("Все действия");
        actions.forEach(System.out::println);
    }
    // иметь возможность откатить последнее действие
}
