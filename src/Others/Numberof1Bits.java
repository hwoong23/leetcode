package Others;

public class Solution {
  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    String binary = Integer.toBinaryString(n);
    char[] binaryChar = binary.toCharArray();
    int cnt = 0;
    for (char ch : binaryChar) {
      if (ch == '1') {
        cnt++;
      }
    }
    return cnt;
  }
}