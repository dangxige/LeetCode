class Solution {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> input=new HashMap<Integer,Integer>();
		int[] res=new int[2];
		for(int i=0;i<nums.length;i++){
			if(input.containsKey(target-nums[i])){
				res[1]=i;
				res[0]=input.get(target-nums[i]);
			}
			input.put(nums[i],i);
		}
		return res;
	}
}