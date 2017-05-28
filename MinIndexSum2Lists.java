import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by devil on 5/28/17.
 */
public class MinIndexSum2Lists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> input = new HashMap<String, Integer>();
        for(int i=0;i<list1.length;i++) input.put(list1[i], i);
        int min = Integer.MAX_VALUE;
        List<String> result = new ArrayList<String>();
        for(int i=0;i<list2.length;i++){
            if(input.containsKey(list2[i])){
                if(i+input.get(list2[i])<min)
                    min = i+input.get(list2[i]);
            }
        }

        for(int i=0;i<list2.length;i++){
            if(input.containsKey(list2[i])){
                if(i+input.get(list2[i])==min)
                    result.add(list2[i]);
            }
        }
        String[] output = new String[result.size()];
        for(int i=0;i<result.size();i++)     output[i] = result.get(i);
        return output;
    }
}
