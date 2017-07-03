import java.util.ArrayList;
import java.util.List;

public class StringIterator {

    int count;
    int ptr;
    String input;
    public StringIterator(String compressedString) {
        this.input = compressedString;
        this.count = 0;
        this.ptr = 0;
    }

    public static void main(String[] args){
        StringIterator check = new StringIterator("L1e2t1C1o1d1e1");
        System.out.println(check.next());
        System.out.println(check.next());
        System.out.println(check.next());System.out.println(check.next());
        System.out.println(check.next());
        System.out.println(check.next());
        System.out.println(check.next());
        System.out.println(check.next());
        check.hasNext();


    }

    private char next() {
        if(count==0)    count = Integer.valueOf(String.valueOf(this.input.charAt(ptr+1)));
        if(count>1){
            count--;
            return this.input.charAt(ptr);
        }
        else{
            ptr += 2;
            count = 0;
            return this.input.charAt(ptr-2);
        }
    }

    private boolean hasNext() {
        List<Integer> check;
       check = new ArrayList<>();
        if(count>0) return true;
        if(ptr>=this.input.length())    return false;
        else return true;
    }
}