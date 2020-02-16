import java.util.Calendar;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private Integer dateOfBirth;
    private String gender;
    private String ID;


    public Student(String firstName, String lastName, Integer dateOfBirth, String gender, String ID) throws StudentException {
        if (firstName.isEmpty() || (lastName.isEmpty())) {
            throw new StudentException("First Name and last Name should not be null!");
        }
        this.firstName = firstName;
        this.lastName = lastName;

        int year = Calendar.getInstance().get(Calendar.YEAR);
        if (dateOfBirth < 1900) {
            throw new StudentException("Date of birth should be after 1900!");
        }

        if (dateOfBirth > (year - 18)) {
            throw new StudentException("Age should be above 18!");
        }
        this.dateOfBirth = dateOfBirth;

        if ((gender == "f") || (gender == "F") || (gender == "m") || (gender == "M")) {
            this.gender = gender;
        } else {
            throw new StudentException("Gender should be one of the following: F/f or M/m! ");
        }

        if (ID.isEmpty()) {
            throw new StudentException("ID cannot be empty!");
        }
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", CNP='" + ID + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public int compareTo(Student s) {
        return this.firstName.compareTo(s.firstName);
    }
}
