// Largest Prime Factor
// The prime factors of 455 are 5, 7 and 13.
// Write a method that calculates the largest prime factor of a given number.

public class LargestPrimeFactor {

  public static void main(String[] args) {
    System.out.println(largestPrimeFactor(455));
    // output: 13
  }

  public static Integer largestPrimeFactor(Integer n) {
    if (n == 2) return 2;

    for (int i = n - 1; i >= 2 ; i--) {
      if (n % i == 0) {
        boolean ip = true;
        for (int j = 2; j < i; j++) {
          if (i % j == 0) {
            ip = false;
            break;
          }
        }
        if (ip)
          return i;
      }
    }

    return 1;
  }

}
