import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class SuiteTest {
    public static void main(String args[]) {
        Result result = JUnitCore.runClasses(FizzBuzzTests.class);
        System.out.println(result.wasSuccessful());

    }
}
