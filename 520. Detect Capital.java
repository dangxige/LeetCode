class Solution {
	public boolean detectCapitalUse(String word) {
		boolean flag;
		if(word.length()<2)
			return true;
		if(!Character.isUpperCase(word.charAt(0)))
			flag=false;
		else if(Character.isUpperCase(word.charAt(1)))
			flag=true;
		else flag=false;
		for(int i=1;i<word.length();i++){
			if(Character.isUpperCase(word.charAt(i))!=flag)
				return false;
		}
		return true;
	}
}