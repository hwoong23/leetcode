class Solution {
  public int removeDuplicates(int[] nums) {
    int ret = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        ret++;
      } else {
        if (nums[i] != nums[i - 1]) {
          nums[ret] = nums[i];
          ret++;
        }
      }
    }
    return ret;
  }
}