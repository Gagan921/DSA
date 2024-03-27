/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetrics(root, root);
    }
    public static boolean isSymmetrics(TreeNode c1, TreeNode c2){
        if(c1 ==null && c2==null){
            return true;
        }
        if(c1 ==null || c2==null){
            return false;
        }
        return c1.val==c2.val && isSymmetrics(c1.left, c2.right) && isSymmetrics(c1.right, c2.left);
    }
}