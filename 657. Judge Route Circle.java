class Solution {
	public boolean judgeCircle(String moves) {
		if(moves.length()==0) return true;
		int a=0;
		int b=0;
		String[] nums=new String[moves.length()];
		for(int i=0;i<moves.length();i++){
			if(String.valueOf(moves.charAt(i)).equals("U")) a++;
			else if(String.valueOf(moves.charAt(i)).equals("D")) a--;
			else if(String.valueOf(moves.charAt(i)).equals("L")) b++;
			else b--;
		}
		return (a==0&&b==0);
	}
}