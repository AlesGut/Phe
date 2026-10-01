package pracktice_3_dz;

public class University {
    static String universityName = "BMSTU"; // общее имя университета
    final int STUDENT_ID; // уникальный ID
    String studentName; //имя студента

    University(int someStudentID, String someStudetName) {  //Конструктор класса University
        this.STUDENT_ID = someStudentID;
        this.studentName = someStudetName;
    }

    String getStudentName() { // геттер для переменной studentName
        return studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    void printStudentInfo() {
        System.out.println("ID студента " + this.STUDENT_ID + ", Имя студента " + getStudentName() + ", Название университета " + universityName);
    }
}
