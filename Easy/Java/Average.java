// Average Value (Java 8 Lambdas and Streams)
// Write a method that returns the average of a list of integers.

import java.util.List;
import java.util.Arrays;

public class Average {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(100, 10);

    System.out.println(average(list));
    // output: 55.0
  }

  public static Double average(List<Integer> list) {
    return list.stream().mapToInt(Integer::intValue).average().getAsDouble();
  }

}
