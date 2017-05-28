import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by devil on 5/28/17.
 */
public class Inorder {

    // Definition for a binary tree node.
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<Integer>();
            inorder(list, root);
            return list;
        }

        public void inorder(List<Integer> list, TreeNode root) {
            if (root == null) return;

            inorder(list, root.left);
            list.add(root.val);
            inorder(list, root.right);
        }
}
