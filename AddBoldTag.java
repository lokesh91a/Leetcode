import java.util.HashMap;
import java.util.HashSet;

public class AddBoldTag {



    public String addBoldTag(String s, String[] dict) {
        StringBuilder output = new StringBuilder();
        output.append(s);
        StringBuilder temp = new StringBuilder();
        StringBuilder check = new StringBuilder();

        for(int i=0;i<dict.length;i++){

        }
        return "";
    }

    public int triangleNumber(int[] nums) {
        HashMap<Integer, Integer> input = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(input.containsKey(nums[i]))  input.put(nums[i], input.get(nums[i])+1);
            else input.put(nums[i], 1);
        }
        int[] in = new int[input.size()];
        int ptr = 0;
        for(int i: input.keySet())  in[ptr++] = i;
        int count = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    a = nums[i];
                    b = nums[j];
                    c = nums[k];
                    if(a+b>c && a+c>b && b+c>a) {
                        count += input.get(a)*input.get(b)*input.get(c);
                    }
                }
            }
        }
        return count;
    }
}