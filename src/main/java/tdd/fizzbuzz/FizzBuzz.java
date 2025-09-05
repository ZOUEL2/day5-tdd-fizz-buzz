package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOffNormal(int num) {
        return String.valueOf(num);
    }

    public String countOffMultiple3(int num) {
        return num % 3 == 0 ? "Fizz" : null;
    }


    public String countOffMultiple5(int num) {
        return num % 5 == 0 ? "Buzz" : null;
    }

    public String countOffMultiple3And5(int num) {
        return null;
    }
}
