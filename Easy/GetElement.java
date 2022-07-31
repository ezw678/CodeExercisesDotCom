// Write a method that returns the nth odd element of a list.
// If the index of the element exceeds the list size, then return -1.

import java.util.List;
import java.util.Arrays;

public class GetElement {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(3, 79, 55, 3);

    System.out.println(getElement(list, 2));
    // output: 55
  }

  public static Integer getElement(List<Integer> list, Integer n) {
    int index = 2 * (n - 1);

    if (index > list.size() - 1 || n <= 0)
      return -1;

    return list.get(index);
  }

}
