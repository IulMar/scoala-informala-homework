import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void addStudentMissingFirstName() {
        try {
            Student s = new Student("", "DDD", 1988, "f", "343534");

        } catch (StudentException e) {
            e.printStackTrace();
            Assert.assertTrue(true);
            return;
        }
        Assert.assertTrue(false);
    }

    @Test
    public void addStudentMissingLastName() {
        try {
            Student s = new Student("ddd", "", 1988, "f", "343534");

        } catch (StudentException e) {
            e.printStackTrace();
            Assert.assertTrue(true);
            return;
        }
        Assert.assertTrue(false);
    }

    @Test
    public void addStudentMissingName() {
        try {
            Student s = new Student("", "", 1988, "f", "343534");

        } catch (StudentException e) {
            e.printStackTrace();
            Assert.assertTrue(true);
            return;
        }
        Assert.assertTrue(false);
    }

    @Test
    public void addCorrectStudent() {
        try {
            Student s = new Student("ddd", "DDD", 1988, "f", "343534");

        } catch (StudentException e) {
            e.printStackTrace();
            Assert.assertTrue(false);
            return;
        }
        Assert.assertTrue(true);
    }

    @Test
    public void checkBirthUnder18(){
        try {
            Student s = new Student("ddd", "DDD", 2009, "f", "343534");

        } catch (StudentException e) {
            e.printStackTrace();
            Assert.assertTrue(true);
            return;
        }
        Assert.assertTrue(false);
    }

    @Test
    public void checkBirthBefore1900(){
        try {
            Student s = new Student("ddd", "DDD", 1889, "f", "343534");

        } catch (StudentException e) {
            e.printStackTrace();
            Assert.assertTrue(true);
            return;
        }
        Assert.assertTrue(false);
    }

    @Test
    public void checkStudentGender(){
        try {
            Student s = new Student("ddd", "DDD", 1988, "c", "343534");

        } catch (StudentException e) {
            e.printStackTrace();
            Assert.assertTrue(true);
            return;
        }
        Assert.assertTrue(false);
    }

    @Test
    public void addStudentMissingID() {
        try {
            Student s = new Student("ddd", "DDD", 1988, "f", "");

        } catch (StudentException e) {
            e.printStackTrace();
            Assert.assertTrue(true);
            return;
        }
        Assert.assertTrue(false);
    }
}
