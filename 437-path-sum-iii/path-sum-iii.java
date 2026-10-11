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
    int count(TreeNode root, long targetSum){
        if(root==null) return 0;
        int c=0;
        if(root.val==targetSum) c++;

        return c+count(root.left,targetSum-root.val)+count(root.right,targetSum-root.val);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        int c=0;
        
        c+=count(root,targetSum);
        return c+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
    }
}