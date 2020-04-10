import static org.junit.Assert.*;

public class JenkinsCalculatorTest {

    @org.junit.Test
    public void addNumbers() {
        JenkinsCalculator add = new JenkinsCalculator();
        assertEquals(10, add.addNumbers(5,5));
    }

    @org.junit.Test
    public void substractNumbers() {
        JenkinsCalculator add = new JenkinsCalculator();
        assertEquals(10, add.substractNumbers(15,5));
    }
}