/**
 * Created by dangxige on 2017/5/24.
 */
public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
                sum=sum+nums[i];
        }
        return sum;
    }
}