// A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
// Write a method that returns the longest palindrome substring of a given string.

public class FindLongestPalindrome {

  public static void main(String[] args) {
    String word = "abattd";

    System.out.println(findLongestPalindrome(word));
    // output: aba
  }

  public static String findLongestPalindrome(String word) {
    int len = word.length();

    int start = 0;
    int end = -1;

    int l, r;
    for (int i = 0; i < len; i++) {
      l = r = i;
      while (l >= 0 && word.charAt(l) == word.charAt(i)) {
        l--;
      }

      while (r < len && word.charAt(r) == word.charAt(i)) {
        r++;
      }

      while (l >= 0 && r < len) {
        if (word.charAt(l) != word.charAt(r)) {
          break;
        } else {
          l--;
          r++;
        }
      }
      l++;
      r--;

      if (end - start < r - l) {
        end = r;
        start = l;
      }
    }

    return word.substring (start, end + 1);
  }

}
