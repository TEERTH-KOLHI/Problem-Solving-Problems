/*
  Given an integer array nums and an integer k, modify the array in the following way:

choose an index i and replace nums[i] with -nums[i].
You should apply this process exactly k times. You may choose the same index i multiple times.

Return the largest possible sum of the array after modifying it in this way.
*/
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int idx = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= k; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < min){
                    idx = j;
                }
                min = Math.min(nums[j], min);
            }
            nums[idx] = min * (-1);
            min = Integer.MAX_VALUE;
        }
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
}
