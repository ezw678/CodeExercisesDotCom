// Ceasar Cipher
// The Ceasar cipher is a basic encryption technique used by Julius Ceasar to
// securely communicate with his generals. Each letter is replaced by another
// letter N positions down the english alphabet. For example, for a rotation
// of 5, the letter 'c' would be replaced by an 'h'. In case of a 'z', the
// alphabet rotates and it is transformed into a 'd'.
// Implement a decoder for the Ceasar cipher where N = 5.
// TIP: Use code.toCharArray() to get an array of characters.

public class Decode {

  public static void main(String[] args) {
    System.out.println(decode("diozmqdzr"));
    // output: interview
  }

  public static String decode(String code) {
    char [] chs = code.toCharArray();

    String dc = "";
    for (char ch : chs) {
      dc += ch + 5 > 'z' ? (char) (ch + 5 - ('z' - 'a' + 1)) : (char)(ch + 5);
    }

    return dc;
  }

}
