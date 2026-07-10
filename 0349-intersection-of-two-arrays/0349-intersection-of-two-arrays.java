class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int i = 0; i< nums1.length; i++){
            int current = nums1[i];
            set1.add(current);
        }
        for(int i = 0; i < nums2.length; i++){
            int current = nums2[i];
            if(set1.contains(current)){
                result.add(current);
            }
        }
        int[] ans = new int[result.size()];
        int index = 0;
        for(int current:result){
        ans[index] = current; 
        index++;
        }
        return ans;
    }
    


    
}