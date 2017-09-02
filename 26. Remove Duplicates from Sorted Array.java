class Solution {
	public int removeDuplicates(int[] nums) {
		if(nums.length==0){
			return 0;
		}
		else{
			int count=1;
			for(int n:nums){
				if(n!=nums[count-1]){
					nums[count]=n;
					count++;
				}
			}
			return count;
		}
	}
}