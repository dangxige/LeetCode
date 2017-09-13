class Solution {
	public String reverseStr(String s, int k) {
		int n=s.length()/(k*2);
		char[] word=s.toCharArray();
		for(int i=0;i<n;i++){
			int a=i*2*k;
			int b=i*2*k+k-1;
			reserve(word,a,b);
		}
		int begin=n*2*k;
		int end=0;
		if(s.length()%(k*2)>k) end=n*2*k+k-1;
		else end=s.length()-1;
		reserve(word,begin,end);
		return new String(word);
	}
	public void reserve(char[] word,int a,int b){
		while(a<b){
			char tmp=word[a];
			word[a]=word[b];
			word[b]=tmp;
			a++;
			b--;
		}
	}
}