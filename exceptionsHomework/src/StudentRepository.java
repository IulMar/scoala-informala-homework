import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentRepository {
    private List<Student> studentList;

    public StudentRepository() {
        studentList = new ArrayList<>();
    }

    public void addStudent(String firstName, String lastName, Integer dateOfBirth, String gender, String ID) throws StudentException {
        Student student = new Student(firstName, lastName, dateOfBirth, gender, ID);
        studentList.add(student);
        Collections.sort(studentList);
    }

    public void removeStudent(String ID) {
        for (Student student : studentList) {
            if (ID == student.getID()) {
                studentList.remove(student);
                break;
            }
        }

    }

    @Override
    public String toString() {
        return "StudentRepository{" +
                "studentList=" + studentList +
                '}';
    }
}



