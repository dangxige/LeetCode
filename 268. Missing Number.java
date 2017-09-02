public class Solution {
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		int rs=0;
		if(nums[nums.length-1]!=nums.length) rs=nums.length;
		else{
			for(int i=0;i<nums.length;i++){
				if(nums[i]!=i){
					rs=i;
					break;
				}
			}
		}
		return rs;
	}
}