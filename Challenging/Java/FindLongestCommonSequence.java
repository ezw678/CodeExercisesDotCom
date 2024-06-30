// Longest Common Sequence
// Given two strings, write a method that finds the longest common sub-sequence.

public class FindLongestCommonSequence {

  public static void main(String[] args) {
    String s1 = "abattd";
    String s2 = "gdgeaba";

    System.out.println(findLongestCommonSequence(s1, s2));
    // output: aba
  }

  static public String findLongestCommonSequence(String s1, String s2) {
    int len1 = s1.length();
    int len2 = s2.length();

    int [][] T = new int [len1 + 1][len2 + 1];
    for (int i = 1; i <= len1; i++) {
      for (int j = 1; j <= len2; j++) {
        if (s1.charAt(i - 1) == s2.charAt(j - 1))
          T[i][j] = T[i - 1][j - 1] + 1;
        else
          T[i][j] = Math.max(T[i - 1][j], T[i][j - 1]);
      }
    }

    StringBuilder sb = new StringBuilder();
    int i = len1;
    int j = len2;
    while (i > 0 && j > 0) {
      if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
        sb.append(s2.charAt(j - 1));
        i--;
        j--;
      } else {
        if (T[i - 1][j] > T[i][j - 1]) {
          i--;
        } else
          j--;
      }
    }

    return sb.reverse().toString();
  }

}
