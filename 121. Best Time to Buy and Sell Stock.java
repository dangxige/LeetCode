public class Solution {
	public int maxProfit(int[] prices) {
		int min=Integer.MAX_VALUE;
		int pro=0;
		for(int i:prices){
			if(i<min) min=i;
			if(i-min>pro) pro=i-min;
		}
		return pro;
	}
}