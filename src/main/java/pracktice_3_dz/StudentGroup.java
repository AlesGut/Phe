package pracktice_3_dz;

public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String somGroupName, int somStudentCount) {
        this.groupName = somGroupName;
        this.studentCount = somStudentCount;
    }

    String getGroupName() {
        return groupName;
    }

    int getStudentCount() {
        return studentCount;
    }

    void setGroupName(String newGroupName) {
        this.groupName = newGroupName;
    }

    void setStudentCount(int newStudentCount) {
        this.studentCount = newStudentCount;
    }

    void printInfo() {
        System.out.println("Название группы - " + getGroupName() + ", Число Студентов = " + getStudentCount());
    }

}
