class Solution {
	public int rob(int[] nums) {
		int[][] res=new int[nums.length+1][2];
		for(int i=1;i<=nums.length;i++){
			res[i][0]=Math.max(res[i-1][0],res[i-1][1]);
			res[i][1]=res[i-1][0]+nums[i-1];
		}
		return Math.max(res[nums.length][0],res[nums.length][1]);
	}
}