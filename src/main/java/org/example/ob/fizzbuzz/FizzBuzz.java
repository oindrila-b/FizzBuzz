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
        if ((num % 3 == 0) && (num % 5 == 0)) {
            return "FizzBuzz";
        }
       else if ((num % 3 == 0) || (digitTest(num, 3))) {
            return "Fizz";
        }
        else if ((num % 5 == 0) || (digitTest(num, 5))) {
            return "Buzz";
        }
        else  if ((num % 3 == 0) && (num % 5 == 0)) {
            return "FizzBuzz";
        }
        else {
            return String.valueOf(num);
        }
    }
}