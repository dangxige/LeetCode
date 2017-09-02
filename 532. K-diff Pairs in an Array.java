class Solution {
	public int findPairs(int[] nums, int k) {
		Map<Integer,Integer> tmp=new HashMap<>();
		int count=0;
		if(k<0){return 0;}
		else{
			for(int i=0;i<nums.length;i++){
				if(tmp.containsKey(nums[i])){
					if(k==0&&tmp.get(nums[i])==1){count++;}
				}
				else {
					if(tmp.containsKey(nums[i]+k)){count++;}
					if(tmp.containsKey(nums[i]-k)){count++;}
				}
				if(tmp.containsKey(nums[i])){tmp.put(nums[i],tmp.get(nums[i])+1);}
				else{tmp.put(nums[i],1);}
			}
			return count;
		}
	}
}