// Convert to Upper Case (Java 8 Lambdas and Streams)
// Write a method that converts all strings in a list to their upper case.

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class UpperCase {

  public static void main(String[] args) {
    List<String> list = Arrays.asList ("hello", "wendy", "tom");

    System.out.println(upperCase(list));
    // output: [HELLO, WENDY, TOM]
  }

  public static List<String> upperCase(List<String> list) {
    return list.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
  }

}
