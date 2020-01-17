package String;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseIntegerTest {

  @Test
  void reverse() {
    Assertions.assertEquals(ReverseInteger.reverse(123), 321);
    Assertions.assertEquals(ReverseInteger.reverse(-123), -321);
    Assertions.assertEquals(ReverseInteger.reverse(120), 21);
    Assertions.assertEquals(ReverseInteger.reverse(1534236469), 0);
  }
}