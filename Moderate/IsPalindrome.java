// A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
// Write a method that detects if a string is a palindrome.
// Tip: Use word.charAt(i) to get the character at position i.

public class IsPalindrome {

  public static void main(String[] args) {
    String str = "abba";

    System.out.println(isPalindrome(str));
    // output: true
    System.out.println(isPalindrome2(str));
    System.out.println(isPalindrome3(str));
  }

  // solution 1
  public static boolean isPalindrome(String word) {
    String str = "";
    for (int i = word.length() - 1; i >= 0; i--) {
      str += word.charAt(i);
    }

    return str.equals(word);
  }

  // solution 2
  public static boolean isPalindrome2(String word) {
    StringBuilder sb = new StringBuilder(word);

    return (sb.reverse().toString().equals(word));
  }

  // solution 3
  public static boolean isPalindrome3(String word) {
    int l = 0;
    int r = word.length() - 1;

    while (l <= r) {
      if (word.charAt(l) != word.charAt(r)) {
        return false;
      } else {
        l++;
        r--;
      }
    }

    return true;
  }

}
