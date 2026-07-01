import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int current = nums[i];
            if(map.containsKey(current)){
                int oldCount = map.get(current);
                int newCount = oldCount + 1;
                map.put(current,newCount);
            }
            else{
                map.put(current,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}