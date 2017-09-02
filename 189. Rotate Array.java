public class Solution {
	public void rotate(int[] nums, int k) {
		int len=nums.length;
		int[] tmp=new int[len];
		if(k>len){
			k=k%len;
		}
		for(int i=0;i<len;i++){
			if(i<len-k){tmp[i+k]=nums[i];}
			else{tmp[i-(len-k)]=nums[i];}
		}
		for(int i=0;i<len;i++){
			nums[i]=tmp[i];
		}
	}
}