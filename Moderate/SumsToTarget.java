// Two Sum (Pair with a Given Sum)
// Write a method that checks if there is at least on pair of numbers which sum equals target.
// arr = [1, 3, 4] and target = 5 result is true because the pair (1, 4) sums to five.

import java.util.Map;
import java.util.HashMap;

public class SumsToTarget {

  public static void main(String[] args) {
    Integer [] arr = { -1, 4, 2, 1};
    Integer target = 0;

    System.out.println(sumsToTarget(arr, target));
    // output: true
  }

  public static Boolean sumsToTarget(Integer[] arr, Integer target) {
    Map<Integer, Boolean> map = new HashMap<>();

    for (int i : arr) {
      int dif = target - i;
      if (map.containsKey(dif))
        return true;
      else
        map.put(i, true);
    }

    return false;
  }

}
