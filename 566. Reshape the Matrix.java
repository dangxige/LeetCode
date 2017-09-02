
/**
 * Created by dangxige on 2017/5/25.
 */
public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(r*c==nums.length*nums[0].length){
            int[][] a=new int[r][c];
            for(int i=0;i<r*c;i++){
                a[i/c][i%c]=nums[i/nums[0].length][i%nums[0].length];
            }
            return a;
        }
        else{
            return nums;
        }
    }
}