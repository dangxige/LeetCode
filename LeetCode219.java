import java.util.HashSet;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> m=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(i>k)
                m.remove(nums[i-k-1]);
            if(!m.add(nums[i]))
                return true;
        }
        return false;
    }
}