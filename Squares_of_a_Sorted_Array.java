/*
  Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
*/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int sq[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int val = nums[i] * nums[i];
            sq[i] = val;
        }
        Arrays.sort(sq);
        return sq;
    }
}
