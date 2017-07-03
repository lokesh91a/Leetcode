/**
 * Created by devil on 6/4/17.
 */
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows = nums.length;
        int cols = nums[0].length;
        if(rows*cols!=r*c)  return nums;
        int[][] output = new int[r][c];
        int ptrRow = 0;
        int ptrCol = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(ptrCol<c)    output[ptrRow][ptrCol++] = nums[i][j];
                else{
                    ptrRow++;
                    ptrCol=0;
                    output[ptrRow][ptrCol++] = nums[i][j];
                }
            }
        }
        return output;
    }
}
