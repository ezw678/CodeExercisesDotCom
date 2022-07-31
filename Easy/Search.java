// Write a method that returns the index of the first occurrence of given integer in a list.
// Assume that the index of the first element in the list is zero.
// If the number does not exist return -1.

import java.util.List;
import java.util.Arrays;

public class Search {

  public static void main(String[] args) {
    int n = 6;

    Integer[] arr = {3, 1, 3, 2, 6, 9, 7, 6};

    int res = search(n, arr);
    System.out.println(res);
    // output: 4

    int res2 = search2(n, arr);
    System.out.println(res2);
    // output: 4

  }

  // solution 1
  public static int search(Integer n, Integer[] list) {
    int index = -1;

    for (int i = 0; i < list.length; i++) {
      if (list[i] == (n)) {
        index = i;
        break;
      }
    }

    return index;
  }

  // solution 2
  public static int search2(Integer n, Integer[] list) {
    List<Integer> ls = Arrays.asList(list);

    return ls.indexOf(n);
  }

}
