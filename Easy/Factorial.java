// Write a method that calculates the factorial of a given number.
// Factorial is the product of all positive integers less than or equal
// to n. For example, factorial(4) = 4x3x2x1 = 24.
// TIP: To make it more interesting, try to do it recursively.

import java.util.stream.IntStream;

public class Factorial {

  public static void main(String[] args) {
    int n = 8;

    int res = factorial(n);
    System.out.println(res);
    // output: 40320

    int res2 = factorial2(n);
    System.out.println(res2);
    // output: 40320
  }

  // solution 1
  public static Integer factorial(Integer n) {
    if (n == 1)
      return 1;

    return n * factorial(n - 1);
  }

  // solution 2
  public static Integer factorial2(Integer n) {
    IntStream intstream = IntStream.range(1, n + 1);

    return intstream.reduce(1, (p, i)->p * i);
  }

}
