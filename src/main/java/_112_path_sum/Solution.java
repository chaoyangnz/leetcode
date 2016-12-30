
package _112_path_sum;

import _000_util.TreeNode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/path-sum
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;

        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, root.val));
        while (!stack.empty()) {
            Pair pair = stack.pop();
            if(pair.node.left == null && pair.node.right == null && pair.sum == sum) {
                return true;
            }
            if(pair.node.left != null) {
                stack.push(new Pair(pair.node.left, pair.node.left.val + pair.sum));
            }
            if(pair.node.right != null) {
                stack.push(new Pair(pair.node.right, pair.node.right.val + pair.sum));
            }
        }
        return false;
    }
}

class Pair {
    public TreeNode node;
    public int sum;


    public Pair(TreeNode node, int sum) {
        this.node = node;
        this.sum = sum;
    }
}
