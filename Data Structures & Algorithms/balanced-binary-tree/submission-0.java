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

class DTO {
    int currH;
    boolean isBalanced;
    DTO(int h, boolean iB){
        this.currH = h;
        this.isBalanced = iB;
    }
}

class Solution {

    public DTO checkBalanced(TreeNode curr){
        if(curr == null) return new DTO(0,true);

        DTO left = checkBalanced(curr.left);
        DTO right = checkBalanced(curr.right);

        int currH = Math.max(left.currH, right.currH)+1;

        boolean isBalanced = (left.isBalanced && right.isBalanced && (Math.abs((left.currH)-(right.currH)) <=1));

        return new DTO(currH, isBalanced);
    }

    public boolean isBalanced(TreeNode root) {
        return checkBalanced(root).isBalanced;
    }
}
