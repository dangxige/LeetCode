class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
		int[] flag=new int[magazine.length()];
		for(int i=0;i<magazine.length();i++){
			flag[i]=1;
		}
		for(int i=0;i<ransomNote.length();i++){
			int j=magazine.indexOf(String.valueOf(ransomNote.charAt(i)));
			if(j==-1)
				return false;
			while(flag[j]==0){
				j=magazine.indexOf(String.valueOf(ransomNote.charAt(i)),j+1);
				if(j==-1)
					return false;
			}
			flag[j]=0;
		}
		return true;
	}
}