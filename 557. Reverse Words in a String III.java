class Solution {
	public String reverseWords(String s) {
		String[] word=s.split(" ");
		String res="";
		for(int i=0;i<word.length;i++){
			word[i]=reserve(word[i]);
			if(i==0) res=word[i];
			else res=res+" "+word[i];
		}
		return res;
	}
	public String reserve(String a){
		char[] tmp=a.toCharArray();
		int i=0;
		int j=a.length()-1;
		while(i<j){
			char t=tmp[i];
			tmp[i]=tmp[j];
			tmp[j]=t;
			i++;
			j--;
		}
		return new String(tmp);
	}
}