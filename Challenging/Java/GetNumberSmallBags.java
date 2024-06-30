// Package Rice Bags (part 2)
// Provided that you have a given number of small rice bags (1 kilo each) and big rice
// bags (5 kilos each), write a method that returns the minimum number of small bags
// necessary to package goal kilos of rice. Return -1 if it is not possible to package
// the required rice amount with the bags provided.

public class GetNumberSmallBags {

  public static void main(String[] args) {
    int big = 2, small = 10, goal = 18;

    System.out.println(getNumberSmallBags(big, small, goal));
    // output: 8
  }

  public static Integer getNumberSmallBags(Integer big, Integer small, Integer goal) {
    int needed = 0;

    if (big * 5 >= goal) {
      needed = goal % 5;
    } else {
      needed = goal - big * 5;
    }

    if (small >= needed)
      return needed;
    else
      return -1;
  }

}
