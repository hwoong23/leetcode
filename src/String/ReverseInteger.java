package String;

public class ReverseInteger {
  static public int reverse(int x) {
    if (x > Integer.MAX_VALUE | x < Integer.MIN_VALUE) return 0;
    boolean isNegative = x < 0;
    String absNum = Integer.toString(Math.abs(x));
    String reverseNum = new StringBuilder(absNum).reverse().toString();
    if (isNegative) {
      reverseNum = '-' + reverseNum;
    }
    int ret = 0;
    try {
      ret = Integer.parseInt(reverseNum);
    } catch (NumberFormatException e) {
      System.out.println("overflows!!!");
      return 0;
    }
    return ret;
  }

  public static void main(String[] args) {
    System.out.println(reverse(123));
  }
}


