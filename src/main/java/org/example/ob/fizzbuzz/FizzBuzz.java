package org.example.ob.fizzbuzz;

public class FizzBuzz {

    public boolean digitTest(int num, int expectedDigit) {
        while (num > 0) {
            if (num % 10 == expectedDigit) {
                return true;
            }
            num = num / 10;
        }
        return false;
    }

    public String getFizzBuzz(final int num) {
        if ((num % 3 == 0) || (digitTest(num, 3))) {
            return "Fizz";
        }
        return null;
    }
}