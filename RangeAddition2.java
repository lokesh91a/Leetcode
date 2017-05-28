public class RangeAddition2 {
    public int maxCount(int m, int n, int[][] ops) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        for(int i=0;i<ops.length;i++){
            if(minX>ops[i][0])  minX = ops[i][0];
            if(minY>ops[i][1])  minY = ops[i][1];
        }
        if(minX>m) minX = m;
        if(minY>n) minY = n;
        return minX*minY;
    }
}