package Design;

import java.util.Random;

class Solution {
  Random random = new Random();
  private int[] first;
  private int[] nums;

  public Solution(int[] nums) {
    first = nums.clone();
    this.nums = nums;
  }

  /**
   * Resets the array to its original configuration and return it.
   */
  public int[] reset() {
    return first;
  }

  /**
   * Returns a random shuffling of the array.
   */
  public int[] shuffle() {
    int temp;
    for (int i = 0; i < nums.length; i++) {
      int randomIdx = random.nextInt(nums.length);
      temp = nums[randomIdx];
      nums[randomIdx] = nums[i];
      nums[i] = temp;
    }
    return nums;
  }
}


/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */