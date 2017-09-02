public class Solution {
	public int maxSubArray(int[] nums) {
		int n=nums.length;
		int[] dp=new int[n];
		dp[0]=nums[0];
		int max=dp[0];
		for(int i=1;i<n;i++){
			if(dp[i-1]>0){
				dp[i]=dp[i-1]+nums[i];
			}
			else dp[i]=nums[i];
			if(dp[i]>max){max=dp[i];}
		}
		return max;
	}
}