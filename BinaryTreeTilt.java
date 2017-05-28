/**
 * Created by devil on 5/28/17.
 */
public class BinaryTreeTilt {
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val = 0;
    }

    int tilt = 0;

    public int findTilt(TreeNode root) {
        postorder(root);
        return tilt;
    }

    public int postorder(TreeNode node){
        if(node==null)   return 0;
        int left = postorder(node.left);
        int right = postorder(node.right);
        tilt += Math.abs(left-right);
        return left + right + node.val;
    }
}
