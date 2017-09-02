public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                n++;
                if(n>count)
                    count=n;
            }
            else
                n=0;
        }
        return count;
    }
}