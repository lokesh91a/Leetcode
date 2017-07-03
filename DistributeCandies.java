import java.util.HashMap;

/**
 * Created by devil on 6/4/17.
 */
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < candies.length; i++) {
            if (map.containsKey(candies[i])) map.put(candies[i], map.get(candies[i]) + 1);
            else map.put(candies[i], 1);
        }
        //if (candies.length)
        return -1;


    }
}
