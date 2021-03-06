import org.example.ob.fizzbuzz.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTests {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testFizzEqual() {
        final String expected = "Fizz";
        Assert.assertEquals(expected, fizzBuzz.getFizzBuzz(9));
    }

    @Test
    public void testFizzNotEqual() {
        final String expected = "Fizz";
        Assert.assertNotEquals(expected, fizzBuzz.getFizzBuzz(2));
    }

    @Test
    public void testBuzzEqual() {
        final String expected = "Buzz";
        Assert.assertEquals(expected, fizzBuzz.getFizzBuzz(20));
    }

    @Test
    public void testBuzzNotEqual() {
        final String expected = "Buzz";
        Assert.assertNotEquals(expected, fizzBuzz.getFizzBuzz(17));
    }

    @Test
    public void FizzBuzzEqual() {
        final String expected = "FizzBuzz";
        Assert.assertEquals(expected, fizzBuzz.getFizzBuzz(45));
    }

    @Test
    public void testFizzBuzzNotEqual() {
        final String expected = "FizzBuzz";
        Assert.assertNotEquals(expected, fizzBuzz.getFizzBuzz(23));
    }

    @Test
    public void testNumberEqual() {
        final String expected = "2";
        Assert.assertEquals(expected, fizzBuzz.getFizzBuzz(2));
    }

    @Test
    public void testNumberNotEqual() {
        final String expected = "2";
        Assert.assertNotEquals(expected, fizzBuzz.getFizzBuzz(5));
    }

    @Test
    public void testNumberContainsThree() {
        Assert.assertTrue(fizzBuzz.digitTest(13, 3));
    }

    @Test
    public void testNumberDoesNotContainThree() {
        Assert.assertFalse(fizzBuzz.digitTest(15, 3));
    }


}
