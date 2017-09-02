class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res=new ArrayList<>();
		for(int i=0;i<numRows;i++){
			List<Integer> tmp=new ArrayList<>();
			for(int j=0;j<=i;j++){
				if(j==0||j==i){
					tmp.add(1);
				}
				else{
					List<Integer> last=res.get(i-1);
					int n=last.get(j-1)+last.get(j);
					tmp.add(n);
				}
			}
			res.add(tmp);
		}
		return res;
	}
}