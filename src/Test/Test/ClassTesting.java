package Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.impl.Student;
import com.impl.Classroom;


public class ClassTesting {
    public void getStudentList() {
        List<Student> students = new ArrayList<>();
        Optional<List<Student>> studentList = Optional.of(students);
        Classroom classRoom = new Classroom(xyz, studentList);
        assert (classRoom.getStudentlist().isPresent());
    }
}

