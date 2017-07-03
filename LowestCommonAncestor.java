/**
 * Created by devil on 6/6/17.
 */
public class LowestCommonAncestor {

 //   Definition for a binary tree node.
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode currentNode = root;
        while(true){
            if(currentNode==null)   return null;
            if((p.val<currentNode.val && q.val>currentNode.val) || (p.val>currentNode.val && q.val<currentNode.val) || p.val==currentNode.val || q.val==currentNode.val)  return currentNode;
            if(p.val<currentNode.val && q.val<currentNode.val)      currentNode = currentNode.left;
            if(p.val>currentNode.val && q.val>currentNode.val)      currentNode = currentNode.right;
        }
    }

}
