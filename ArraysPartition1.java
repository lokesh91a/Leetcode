import java.util.Arrays;

/**
 * Created by devil on 6/4/17.
 */
public class ArraysPartition1 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ptr = 0;
        int sum = 0;
        while(ptr<nums.length){
            sum+=nums[ptr];
            ptr+=2;
        }
        return sum;
    }
}
