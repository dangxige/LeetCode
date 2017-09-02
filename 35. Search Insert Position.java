public class Solution {
	public int searchInsert(int[] nums, int target) {
		int index=0;
		if(target<nums[0]) index=0;
		else if(target>nums[nums.length-1]) index=nums.length;
		else{
			for(int i=0;i<nums.length;i++){
				if(nums[i]==target){index=i; break;}
				else if(target>nums[i]&&target<nums[i+1]){index=i+1; break;}
			}
		}
		return index;
	}
}