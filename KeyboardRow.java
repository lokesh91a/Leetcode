import java.util.HashMap;

/**
 * Created by devil on 6/4/17.
 */
public class KeyboardRow{
    public String[] findWords(String[] words) {
        if(words==null || words.length==0)  return new String[0];
        StringBuilder output = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('q', 1);
        map.put('z', 3);
        map.put('w', 1);
        map.put('x', 3);
        map.put('e', 1);
        map.put('c', 3);
        map.put('r', 1);
        map.put('v', 3);
        map.put('t', 1);
        map.put('b', 3);
        map.put('y', 1);
        map.put('n', 3);
        map.put('u', 1);
        map.put('m', 3);
        map.put('i', 1);
        map.put('l', 2);
        map.put('o', 1);
        map.put('p', 1);
        map.put('a', 2);
        map.put('s', 2);
        map.put('d', 2);
        map.put('f', 2);
        map.put('g', 2);
        map.put('h', 2);
        map.put('j', 2);
        map.put('k', 2);
        int check = -1;
        boolean flag = true;;
        for(int i=0;i<words.length;i++){
            check = -1;
            flag = true;
            for(int j=0;j<words[i].length();j++){
                if(check==-1)   check = map.get(Character.toLowerCase(words[i].charAt(j)));
                else if(check!=map.get(Character.toLowerCase(words[i].charAt(j)))){
                    flag = false;
                    break;
                }
            }
            if(flag)    output.append(words[i]+" ");
        }
        if(output.toString().equals(""))    return new String[0];
        return output.toString().split(" ");

    }
}
