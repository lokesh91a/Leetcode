/**
 * Created by devil on 5/30/17.
 */
public class DiameterBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int leftH = height(root.left);
        int rightH = height(root.right);
        int lD = diameterOfBinaryTree(root.left);
        int rD = diameterOfBinaryTree(root.right);
        int max = Math.max(lD, rD);
        return Math.max(max, leftH+rightH);
    }

    public int height(TreeNode node){
        if(node==null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }
}
