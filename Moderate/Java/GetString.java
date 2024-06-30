// Comma Separated (Java 8 Lambdas and Streams)
// Write a method that returns a comma - separated string based on a given list of integers. Each element should be preceded by the letter 'e' if the number is even, and preceded by the letter 'o' if the number is odd. For example, if the input list is (3, 44), the output should be 'o3,e44'.

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class GetString {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 5, 7, 8);

    System.out.println(getString(list));
    // output: o1,o5,o7,e8
  }

  public static String getString(List<Integer> list) {
    return list.stream().map(i->(i % 2 == 0 ? "e" + i.toString() : "o" + i.toString())).collect(Collectors.joining(","));
  }

}
