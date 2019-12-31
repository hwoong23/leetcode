package DynamicProgramming;

import java.util.HashMap;

class Solution {
  HashMap<Integer, Integer> memo = new HashMap<>();

  public int climbStairs(int n) {
    return cal(0, n);
  }

  public int cal(int steps, int stairs) {
    if (steps > stairs) {
      return 0;
    }
    if (steps == stairs) {
      return 1;
    }
    if (memo.containsKey(steps)) {
      return memo.get(steps);
    }

    memo.put(steps, cal(steps + 1, stairs) + cal(steps + 2, stairs));
    return memo.get(steps);
  }
}