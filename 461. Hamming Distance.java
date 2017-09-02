/**
 * Created by dangxige on 2017/5/24.
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        int c=x^y;
        while(c!=0){
            c=c&(c-1);
            count++;}
        return count;
    }
}