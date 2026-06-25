import java.util.*;
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int count = 0;

        while(left<right){
            int Sum = nums[left] + nums[right];
            if(Sum > k){
                right--;
            }
            else if(Sum<k){
                left++;
            }
            else{
                left++;
                right--;
                count++;
            }
        }
        return count;
    }
}