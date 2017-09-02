public class Solution {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> rs=new ArrayList<>();
		for(int i=0;i<nums.length;i++){
			int tmp=Math.abs(nums[i])-1;
			if(nums[tmp]>0){
				nums[tmp]=-nums[tmp];
			}
		}
		for(int i=0;i<nums.length;i++){
			if(nums[i]>0){
				rs.add(i+1);
			}
		}
		return rs;
	}
}