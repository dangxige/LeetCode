import java.util.Arrays;

/**
 * Created by dangxige on 2017/4/6.
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        int l=nums.length;
        Arrays.sort(nums);
        boolean m=false;
        if(l>1){
            for(int i=0;i<l-1;i++){
                if(nums[i]==nums[i+1]){
                    m=true;
                    break;
                }
            }
        }
        return m;
    }
}
