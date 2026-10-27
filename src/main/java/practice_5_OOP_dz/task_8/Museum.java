package practice_5_OOP_dz.task_8;

public class Museum {
    private Exhibit exhibit;

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void printInfo() {
        exhibit.describe();
        exhibit.preserve();
    }
}
