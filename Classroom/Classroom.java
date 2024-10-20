import java.sql.SQLOutput;

class Classroom {
    private int limitStudentsNum;
    private int studentNum;
    private String classroomAddr;
    private String profName;
    private String[] studentsName;

    Classroom(int limitStudentsNum, String classroom, String profName) {
        this.limitStudentsNum = limitStudentsNum;
        this.classroomAddr = classroom;
        this.profName = profName;
    }

//    public int getLimitStudentsNum() {
//        return limitStudentsNum;
//    }
//
//    public String getClassroom() {
//        return classroomAddr;
//    }
//
//    public String getProfName() {
//        return profName;
//    }
//

    void addStudents(String[] students) {
        for (String s: students) {
            addStudent(s);
        }
    }

    void addStudent(String name) {
        if(studentNum > limitStudentsNum) {
            System.out.println("정원을 초과했습니다.");
        }
        else {
            studentsName[studentNum] = name;
            studentNum++;
        }
    }

    void printStudentsName() {
        for (int i = 0; i < studentNum; i++) {
            System.out.println(studentsName[i]);
        }
    }

    void printClassInfo() {
        //name빼고 전부 다~
        System.out.println("제한 수: " + limitStudentsNum);
        System.out.println("인원 수: " + studentNum);
        System.out.println("강의실: " + classroomAddr);
        System.out.println("교수명: " + profName);
    }
}

class Main {
    public static void main(String[] args) {


    }
}
