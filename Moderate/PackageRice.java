// Provided that you have a given number of small rice bags (1 kilo each) and big rice
// bags (5 kilos each), write a method that returns true if it is possible to make a
// package with goal kilos of rice.

public class PackageRice {

  public static void main(String[] args) {
    int big = 2;
    int small = 10;
    int goal = 18;

    System.out.println(packageRice(big, small, goal));
    // output: true
  }

  public static Boolean packageRice(Integer big, Integer small, Integer goal) {
    int needed = 0;

    if (big * 5 >= goal)
      needed = goal % 5;
    else
      needed = goal - big * 5;

    if (small >= needed)
      return true;
    else
      return false;
  }

}
