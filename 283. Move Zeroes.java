public class Solution {
	public void moveZeroes(int[] nums) {
		List<Integer> tmp=new ArrayList<>();
		int n=0;
		for(int i:nums){
			if(i!=0) tmp.add(i);
			else n++;
		}
		for(int i=0;i<nums.length;i++){
			if(i<nums.length-n) nums[i]=tmp.get(i);
			else nums[i]=0;
		}
	}
}