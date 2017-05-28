import java.util.HashSet;

/**
 * Created by devil on 5/27/17.
 */
public class ArrayNesting {
        public static void main(String args[]){
            int[] nums = {5,4,0,3,1,6,2};
            System.out.print(arrayNesting(nums));
        }

        public static int arrayNesting(int[] nums) {
            int max = Integer.MIN_VALUE;
            int result = -1;
            HashSet<Integer> set = new HashSet<Integer>();
            HashSet<Integer> check = new HashSet<Integer>();
            for(int i=0;i<nums.length;i++){
                int current = nums[i];
                if(check.contains(current)) continue;
                while(true){
                    if(!set.add(current))   break;
                    current = nums[current];
                }
                if(max<set.size())  max = set.size();
                check.addAll(set);
                set.clear();
            }
            return max;
        }
}
