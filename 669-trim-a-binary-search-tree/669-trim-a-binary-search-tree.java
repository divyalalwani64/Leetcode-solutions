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

// Algorithm:
// when root is less than low value
//    answer lies in root.right
// when root is greater than high value
//    answer lies in root.left
// when root is range
//     answer is root.
//     root.left contains left tree result.
//     root.right contains right tree result.


class Solution {  
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) return null;
        if(root.val<low)
            return trimBST(root.right,low,high);
        else if(root.val>high)
            return trimBST(root.left,low,high);
        root.left=trimBST(root.left,low,high);
        root.right=trimBST(root.right,low,high);
        return root;
    }
}