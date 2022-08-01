// Write a method that returns 'Fizz' for multiples of three and 'Buzz'
// for the multiples of five. For numbers which are multiples of both three
// and five return 'FizzBuzz'. For numbers that are neither, return
// the input number.

public class FizzBuzz {

  public static void main(String[] args) {
    System.out.println(fizzBuzz(15));
    // output: FizzBuzz
  }

  public static String fizzBuzz(Integer i) {
    if (i % 3 == 0 && i % 5 == 0)
      return "FizzBuzz";
    else if (i % 3 == 0 && i % 5 != 0)
      return "Fizz";
    else if (i % 3 != 0 && i % 5 == 0)
      return "Buzz";

    return String.valueOf(i);
  }

}
