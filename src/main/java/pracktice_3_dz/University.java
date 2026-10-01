package pracktice_3_dz;

public class University {
    static String universityName = "BMSTU"; // общее имя университета
    final int studentID; // уникальный ID
    String studentName; //имя студента

    University(int someStudentID, String someStudetName) {  //Конструктор класса University
        this.studentID = someStudentID;
        this.studentName = someStudetName;
    }

    String getStudentName() { // геттер для переменной studentName
        return studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    void printStudentInfo() {
        System.out.println("ID студента " + this.studentID + ", Имя студента " + this.studentName + ", Название университета " + universityName);
    }
}
