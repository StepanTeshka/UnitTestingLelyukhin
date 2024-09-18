import first.task.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestStudents {
    @Test
    void test1() {
        Student student1 = new Student("Dima", "S001");

        Student.addStudent(student1.getStudentId(), student1);

        assertNotNull(Student.getStudent("S001"));
    }

    @Test
    void test2(){
        Student student1 = new Student("Dima", "S001");

        Student.addStudent(student1.getStudentId(), student1);

        assertEquals(Student.getStudent("S001"), student1.getName());
    }
}
