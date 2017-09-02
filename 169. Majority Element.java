public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> n=new HashMap<Integer,Integer>();
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(n.containsKey(nums[i]))
                n.put(nums[i],n.get(nums[i])+1);
            else
                n.put(nums[i],1);
            if(n.get(nums[i])>nums.length/2){
                a=nums[i];
                break;}
        }
        return a;
    }
}