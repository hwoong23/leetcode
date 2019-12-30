package SortingAndSearching;

class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    for (int i = 0; i < n; i++) {
      int M = m + i;
      while (m > 0 && M > 0 && nums1[M - 1] > nums2[i]) {
        nums1[M] = nums1[M - 1];
        M--;
      }
      nums1[M] = nums2[i];
    }
  }
}