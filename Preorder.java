import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by devil on 5/28/17.
 */
public class Preorder {

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        preorder(list, root);
        return list;
    }

    public void preorder(List<Integer> list, TreeNode root) {
        if (root == null) return;
        list.add(root.val);
        preorder(list, root.left);

        preorder(list, root.right);
    }
}
