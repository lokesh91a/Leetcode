/**
 * Created by devil on 6/4/17.
 */
public class ReverseWordsInStringIII {
    public String reverseWords(String s) {
        StringBuilder output = new StringBuilder();
        String[] input = s.split(" ");
        int size = input.length;
        int length = 0;
        for (int i = 0; i < size; i++) {
            length = input[i].length() - 1;
            if (output.length() != 0) output.append(" ");
            for (int j = length; j >= 0; j--) output.append(input[i].charAt(j));

        }
        return output.toString();
    }
}
