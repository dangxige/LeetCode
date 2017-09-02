class Solution {
	public int[][] imageSmoother(int[][] M) {
		int a=M.length;
		int b=M[0].length;
		int[] tmp={-1,0,1};
		int[][] rs=new int[a][b];
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				int sum=0;
				int count=0;
				for(int p:tmp){
					for(int q:tmp){
						if(judge(i+p,j+q,a,b)){
							count++;
							sum+=M[i+p][j+q];
						}
					}
				}
				rs[i][j]=sum/count;
			}
		}
		return rs;
	}
	public static boolean judge(int r,int s,int t,int w){
		if(r>=0&&r<t&&s>=0&&s<w){
			return true;
		}
		else{return false;}
	}
}