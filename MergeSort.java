/**
 * Created by devil on 5/28/17.
 */
public class MergeSort {
    public static void main(String[] args){
        int[] input = {4,3,2,4};
        if(input.length>1)  partition(0,input.length/2, input.length/2+1, input.length-1, input);
    }

    public static void partition(int ls, int le, int rs, int re, int[] input){
        if(le-ls==1 && re-rs==1)    sort(ls,le,rs,re,input);
        else if(le-ls==1 && re-rs>1){
            partition(ls,le,);
        }
    }
}
