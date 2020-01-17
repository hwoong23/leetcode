package Trees;

class Solution {
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
  }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  int maxDepth = 0;

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    findMaxDepth(root, maxDepth);
    return maxDepth;

  }

  public void findMaxDepth(TreeNode node, int depth) {
    if (node != null) {
      depth += 1;
      if (maxDepth < depth) {
        maxDepth = depth;
      }
      findMaxDepth(node.left, depth);
      findMaxDepth(node.right, depth);
    }
  }
}