import java.util.HashMap;
import java.util.Map;

/*
 * Complete the function below.
 */
public class Test{

    class Test1{}

    public static void main(String args[]){
        System.out.println(findMax(9, "1 2 3 # # 4 # # 5"));
    }

    static long findMax(int n, String tree) {
        String[] input = tree.split(" ");
        Map<Integer, Long> map = new HashMap<Integer, Long>();
        Long result = helper(input, 0, map);
        for(Integer key: map.keySet()){
            System.out.println(map.get(key));
        }
        return result;
    }

    static long helper(String[] input, int index, Map<Integer, Long> map){
        if(index>=input.length || input[index].equals("#"))    return 0;
        if(map.containsKey(index))  return map.get(index);
        long current = Long.parseLong(input[index]) + calcGrand(input, index, map);
        long childs = helper(input, index*2+1, map) + helper(input, index*2+2, map);
        map.put(index, Math.max(current, childs));
        return map.get(index);
    }

    static long calcGrand(String[] input, int index, Map<Integer, Long> map){
        if(index>=input.length) return 0;
        long sum = 0;
        int leftofleft = (index*2+1)*2 + 1;
        int rightofleft = (index*2+1)*2 + 2;
        int leftofright = (index*2+2)*2 + 1;
        int rightofright = (index*2+2)*2 + 2;
        if(index*2+1<input.length && !input[index*2+1].equals("#")){
            sum += helper(input, leftofleft, map) + helper(input, rightofleft, map);
        }
        if(index*2+2<input.length && !input[index*2+2].equals("#")){
            sum += helper(input, leftofright, map) + helper(input, rightofright, map);
        }
        return sum;
    }

}



