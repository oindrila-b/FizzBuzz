import org.example.ob.fizzbuzz.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTests {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testFizzEqual() {
        final String expected ="Fizz";
        Assert.assertEquals(expected, fizzBuzz.getFizzBuzz(9));
    }

}
