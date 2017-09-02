public class Solution {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int l=nums.length;
		int rs1=nums[l-1]*nums[l-2]*nums[l-3];
		int rs2=nums[l-1]*nums[0]*nums[1];
		if(rs1>rs2) return rs1;
		else return rs2;
	}
}