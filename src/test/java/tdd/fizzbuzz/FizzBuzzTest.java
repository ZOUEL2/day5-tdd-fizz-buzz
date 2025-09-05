package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_normal_number_when_countOff_normal_number() {
        int num = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOffNormal(num);
        String expectedResult = "1";
        assertEquals(expectedResult, result);
    }

    @Test
    public void should_return_Fizz_when_countOff_multiple_3_number() {
        int num = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOffMultiple3(num);
        String expectedResult = "Fizz";
        assertEquals(expectedResult, result);
    }

    @Test
    public void should_return_Buzz_when_countOff_multiple_5_number() {
        int num = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOffMultiple5(num);
        String expectedResult = "Buzz";
        assertEquals(expectedResult, result);
    }

    @Test
    public void should_return_FizzBuzz_when_countOff_multiple_3_and_5_number() {
        int num = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.countOffMultiple3And5(num);
        String expectedResult = "FizzBuzz";
        assertEquals(expectedResult, result);
    }


}
