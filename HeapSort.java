/**
 * Created by devil on 6/5/17.
 */
public class HeapSort {

    static int[] input = {25,9,26,1};
    public static void main(String args[]){
        int status = 1; //min = 0;max = 1;
    }

    public static int getParent(int index){
        return (index-1)/2;
    }

    public static void heapifyUp(int index){
        int current = index;
        while(current!=0) {
            if (input[current] > input[getParent(index)]) swap(current, getParent(current));
            current = getParent(current);
        }
    }

    public static void heapifyDown(int index){
        int current = index;
        int childLeft = current*2+1;
        int childRight = current*2+2;
        while(current <= input.length){
            childLeft = current*2+1;
            childRight = current*2+2;
            if(input[current]>=input[childLeft] && input[current]>=input[childRight])
                break;
            else if(input[current]<input[childLeft] && input[current]>=input[childRight]){
                swap(current, childLeft);
                current = childLeft;
            }
            else if(input[current]>=input[childLeft] && input[current]<input[childRight]){
                swap(current, childRight);
                current = childRight;
            }
            else{
                if(input[childLeft]>input[childRight]) {
                    swap(current, childLeft);
                    current = childLeft;
                }
                else {
                    swap(current, childRight);
                    current = childRight;
                }
            }
        }
    }

    public static void swap(int index1, int index2){
        input[index1] += input[index2];
        input[index2] = input[index1] - input[index2];
        input[index1] -= input[index2];
    }

    public static void sort(){

    }

    public static void add(){

    }

    public static void remove(){

    }

    public static void removeIndex(){

    }

    public static void getRoot(){

    }


}
