// Write a method that returns the largest integer in the list.
// You can assume that the list has at least one element.

import java.util.Arrays;
import java.util.Collections;

public class  Maximum {

  public static void main(String[] args) {
    Integer[] arr = {1, 505, 10};

    System.out.println(maximum(arr));
    // output: 505

    System.out.println(maximum2(arr));
    System.out.println(maximum3(arr));
  }

  // solution 1
  public static Integer maximum(Integer[] list) {
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < list.length; i++) {
      if (list[i] > max)
        max = list[i];
    }

    return max;
  }

  // solution 2
  public static Integer maximum2(Integer[] list) {
    Integer [] arr = list.clone();
    Arrays.sort(arr, (i, j)->(j - i));

    return arr[0];
  }

  // solution 3
  public static Integer maximum3(Integer[] list) {
    Arrays.sort(list, Collections.reverseOrder());

    return list[0];
  }

}
