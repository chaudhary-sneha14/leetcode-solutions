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

    int count(TreeNode root,int maxVal){
        if(root==null) return 0;
        int c=0;
        if(root.val>=maxVal){
            c+=1;
            maxVal=root.val;
        }
        c+=count(root.left,maxVal);
        c+=count(root.right,maxVal);
        return c;
    }
    public int goodNodes(TreeNode root) {
        return count(root, Integer.MIN_VALUE);
        
    }
}