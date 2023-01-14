//Given the root of a binary tree, return the inorder traversal of its nodes' values.
//Input: root = [1,null,2,3]
//Output: [1,3,2]

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

public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<Integer>();
    recursion(root,result);
    return result;
}

public void recursion(TreeNode root,List<Integer> result){
    if(root==null)
        return;
    recursion(root.left,result);
    result.add(root.val);
    recursion(root.right,result);
}
}
