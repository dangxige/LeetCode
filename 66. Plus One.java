class Solution {
	public int[] plusOne(int[] digits) {
		int tmp=0;
		if(digits[digits.length-1]!=9){digits[digits.length-1]+=1;}
		else {
			for(int i=digits.length-1;;){
				while(i>=0&&digits[i]==9){digits[i]=0;i--;}
				if(i<0){tmp=1;break;}
				else{digits[i]+=1;break;}
			}
		}
		if(tmp==0){return digits;}
		else{
			int[] res=new int[digits.length+1];
			res[0]=1;
			for(int i=0;i<digits.length;i++){
				res[i+1]=digits[i];
			}
			return res;
		}
	}
}