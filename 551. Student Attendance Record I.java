class Solution {
    public boolean checkRecord(String s) {
        char[] a=s.toCharArray();
        boolean res=true;
        int ab=0;
        for(int i=0;i<a.length;i++){
            if(a[i]=='A'){
                ab++;
                if(ab>1){
                    res=false;
                    return res;
                }
            }
            if(a[i]=='L'&&i<a.length-2&&a[i+1]=='L'&&a[i+2]=='L'){
                res=false;
                return res;
            }
        }
        return res;
    }
}