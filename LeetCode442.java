import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by dangxige on 2017/5/25.
 */
public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        for(int n:nums){
            if(a.contains(n))
                b.add(n);
            else
                a.add(n);
        }
        List<Integer> list = new ArrayList<Integer>(b);
        return list;
    }
}