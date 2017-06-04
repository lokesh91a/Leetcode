import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFreqSubtreeSum {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public int[] findFrequentTreeSum(TreeNode root) {
        if(root==null)  return new int[0];
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        findAll(list, root);
        Map<Integer, Integer> check = new HashMap<Integer, Integer>();
        for(int i=0;i<list.size();i++){
            if(check.containsKey(list.get(i))) check.put(list.get(i), check.get(list.get(i))+1);
            else check.put(list.get(i),1);
        }
        int max = Integer.MIN_VALUE;
        for(int i: check.keySet())       if(check.get(i)>max)    max = check.get(i);
        for(int i: check.keySet())       if(check.get(i)==max)  result.add(i);
        int[] op = new int[result.size()];
        for(int i=0;i<result.size();i++)    op[i] = result.get(i);
        return op;
    }

    public int findAll(List<Integer> list, TreeNode node){
        int sum = 0;
        if(node.left==null && node.right==null){
            list.add(node.val);
            return node.val;
        }
        else if(node.left==null && node.right!=null){
            sum = node.val + findAll(list, node.right);
            list.add(sum);
            return sum;
        }
        else if(node.left!=null && node.right==null){
            sum = node.val + findAll(list, node.left);
            list.add(sum);
            return sum;
        }
        else{
            sum = node.val + findAll(list, node.left) + findAll(list, node.right);
            list.add(sum);
            return sum;
        }
    }
}