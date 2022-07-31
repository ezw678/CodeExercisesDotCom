// Given a number n, write a method that sums all multiples of three and five up to
// n (inclusive).

import java.util.stream.IntStream;

public class SumMultiples {

  public static void main(String[] args) {
    int n = 15;

    int res = sum(n);
    System.out.println(res);
    // output: 60

    int res2 = sum2(n);
    System.out.println(res2);
    // output: 60
  }

  // solution 1
  public static Integer sum(Integer n) {
    int i = 0;
    int sum = 0;

    while (i <= n) {
      sum += (i % 3 == 0 || i % 5 == 0) ? i : 0;
      i++;
    }

    return sum;
  }

  // solution 2
  public static Integer sum2(Integer n) {
    IntStream intStream = IntStream.range(1, n + 1);

    return intStream.filter(x->(x % 3 == 0 || x % 5 == 0)).sum();
  }

}
