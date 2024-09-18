package first.task;

import java.util.HashMap;

public class Student {
    static HashMap<String, Student> students = new HashMap<>();
    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public static void addStudent(String id, Student student){
        students.put(id,student);
    }

    public static String getStudent(String id) {
        return students.get(id).name;
    }
}
