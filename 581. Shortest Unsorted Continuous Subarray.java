class Solution {
	public int findUnsortedSubarray(int[] nums) {
		int[] tmp=new int[nums.length];
		int head=0;
		int tail=0;
		for(int i=0;i<nums.length;i++){
			tmp[i]=nums[i];
		}
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++){
			if(nums[i]==tmp[i]){
				head++;
			}
			else{
				break;
			}
		}
		for(int i=nums.length-1;i>=0;i--){
			if(nums[i]==tmp[i]){
				tail++;
			}
			else{
				break;
			}
		}
		if(head==nums.length){
			return 0;
		}
		else{
			return nums.length-head-tail;
		}
	}
}