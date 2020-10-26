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
    @Test
    public void testFizzNotEqual() {
        final String expected = "Fizz";
        Assert.assertNotEquals(expected, fizzBuzz.getFizzBuzz(2));
    }
    @Test
    public void testBuzzEqual(){
        final String expected = "Buzz";
        Assert.assertEquals(expected,fizzBuzz.getFizzBuzz(20));
    }

    @Test
    public void testBuzzNotEqual(){
        final String expected = "Buzz";
        Assert.assertNotEquals(expected,fizzBuzz.getFizzBuzz(17));
    }
    @Test
    public void  FizzBuzzEqual(){
        final  String expected = "FizzBuzz";
        Assert.assertEquals(expected,fizzBuzz.getFizzBuzz(45));
    }





}
