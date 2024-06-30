// Write a method that returns the nth element of the Fibonacci Sequence
// The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
// The next number is found by adding up the two numbers before it.
// Assume that indexes start at zero, e.g., fib(0) = 0, fib(1) = 1, ...
// actually this nth is actually just the index, i.e., 3rd is 2, and 2 is not the 4th.

import java.util.Arrays;

public class Fibonacci {

  public static void main(String[] args) {
    int n = 9;
    System.out.println(fibonacci(n));
    // output: 34
    System.out.println(fibonacci2(n));
    System.out.println(fibonacci3(n));
    System.out.println(fibonacci4(n));
    System.out.println(fibonacci5(n));
  }

  // solution 1
  public static Integer fibonacci(Integer n) {
    if (n <= 1)
      return n;

    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  // solution 2
  public static Integer fibonacci2(Integer n) {
    if (n <= 1)
      return n;

    int fib0 = 0, fib1 = 1;
    int fib = 0;

    for (int i = 2; i <= n; i++) {
      fib = fib0 + fib1;
      fib0 = fib1;
      fib1 = fib;
    }

    return fib;
  }

  // solution 3
  //tabulation
  public static Integer fibonacci3(Integer n) {
    if (n <= 1)
      return n;

    int [] fbs = new int [n + 1];

    fbs[0] = 0;
    fbs[1] = 1;
    for (int i = 2; i <= n; i++) {
      fbs[i] = fbs[i - 1] + fbs[i - 2];
    }

    return fbs[n];
  }

  // solution 4
  // memorization
  public static Integer fibonacci4(Integer n) {
    if (n <= 1)
      return n;

    int [] M = new int [n + 1];
    Arrays.fill(M, -1);
    M[0] = 0;
    M[1] = 1;

    return (fibonacci4(n, M));
  }

  static int fibonacci4(int n, int [] M) {
    int fb1 = -1;
    int fb2 = -1;

    if (M[n - 2] != -1)
      fb1 = M[n - 2];
    else {
      fb1 = fibonacci4(n - 2, M);
    }

    if (M[n - 1] != -1)
      fb2 = M[n - 1];
    else {
      fb2 = fibonacci4(n - 1, M);
    }

    M[n] = fb1 + fb2;

    return M[n];
  }

  // solution 5
  // memorization
  static Integer fibonacci5(Integer n) {
    if (n <= 1)
      return n;

    int [] M = new int [n + 1];
    Arrays.fill(M, -1);

    int fb = fibonacci5(n, M);

    return fb;
  }

  static int fibonacci5(int n, int [] M) {
    if (n <= 1)
      return n;

    if (M[n] == -1)
      M[n] = fibonacci5(n - 1, M) + fibonacci5(n - 2, M);

    return M[n];
  }

}
