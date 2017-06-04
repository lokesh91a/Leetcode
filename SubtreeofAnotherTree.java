public class SubtreeofAnotherTree {

    //  Definition for a binary tree node.

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(t==null)     return true;
        if(s==null && t!=null) return false;
        //System.out.println((startNode.val) + "" + findResult(startNode, t));
        return findResult(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    public boolean findResult(TreeNode startNode, TreeNode t){
        if(startNode==null && t == null) return true;
        if((startNode==null && t!=null) || (startNode!=null && t==null) || (startNode.val!=t.val))  return false;
        return findResult(startNode.right, t.right) && findResult(startNode.left, t.left);
    }
}