// Filter Strings (Java 8 Lambdas and Streams)
// Given a list of strings, write a method that returns a list of all strings that
// start with the letter 'a' (lower case) and have exactly 3 letters. TIP: Use Java
// 8 Lambdas and Streams API's.

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class search {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("abc", "bbb", "ab", "add");

    System.out.println(search(list));
    // output: [abc, add]
  }

  public static List<String> search(List<String> list) {
    return list.stream().filter(s->(s.charAt(0) == 'a' && s.length() == 3)).collect(Collectors.toList());
  }

}
