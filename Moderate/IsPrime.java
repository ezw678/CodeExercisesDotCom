// A prime number is a natural number greater than 1 that has
// no positive divisors other than 1 and itself. Write a
// method that checks if a number is a prime number.

public class IsPrime {

  public static void main(String[] args) {
    System.out.println(isPrime(15));
    // output: false
  }

  public static Boolean isPrime(Integer n) {
    if (n <= 1) return false;
    if (n == 2) return true;

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }

}
