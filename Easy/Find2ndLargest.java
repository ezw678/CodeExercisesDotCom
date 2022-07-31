// Find the second largest number in an integer array. You can assume a minimum array
// length of two.

import java.util.Arrays;

public class Find2ndLargest {

  public static void main(String[] args) {
    Integer [] arr = { -1, 4, 2, 1};

    System.out.println(find(arr));
    // output: 2
  }

  public static Integer find(Integer[] arr) {
    Arrays.sort(arr, (i, j)->(j - i));
    return arr[1];
  }

}
