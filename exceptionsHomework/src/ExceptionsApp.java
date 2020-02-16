import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionsApp {

    private static Logger logger = Logger.getLogger("my.class.fqn");

    public static void main(String[] args) throws ParseException, StudentException {
        logger.info("start main");

        StudentRepository repository = new StudentRepository();
        try {
            repository.addStudent("", "EEE", 1951, "m", "34245");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error during run", e);
        }

        try {
            repository.addStudent("bbb", "BBB", 1890, "M", "37426");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error during run", e);
        }
        try {
            repository.addStudent("ddd", "DDD", 1975, "f", "843487");
            repository.addStudent("ccc", "CCC", 1980, "m", "31123");
            repository.removeStudent("37426");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error during run", e);
        }
        logger.info("end main");
        System.out.println(repository);

    }
}

