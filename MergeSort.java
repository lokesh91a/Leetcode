/**
 * Created by devil on 6/5/17.
 */
public class MergeSort {
    public static void main(String args[]){
        int[] input = {8, 9 , 1 , 11};
        divide(input, 0, input.length-1);
    }

    public static void divide(int[] input, int left, int right){
        if(left < right) {
            int mid = (left + right) /2;
            divide(input, left,mid);
            divide(input,mid+1,right);
            merge(input,left,mid,right);
        }
    }

    public static void merge(int[] input, int left, int mid, int right){
        int[] l = new int[mid-left+1];
        int[] r = new int[right-mid];
        for(int i=left;i<=mid;i++) l[i] = input[i];
        for(int i=mid+1;i<=right;i++) r[i] = input[i];
        int ptrL = 0; int ptrR = 0;
        int sizeL = mid-left+1;    int sizeR = right-mid;
        int ptr = left;
        while(ptrL<sizeL && ptrR<sizeR){
            if(l[ptrL]<r[ptrR])         input[ptr++] = l[ptrL++];
            else    input[ptr++] = r[ptrR++];
        }

        while(ptrL<sizeL)   input[ptr++] = l[ptrL++];
        while(ptrR<sizeR)   input[ptr++] = r[ptrR++];
    }
}
