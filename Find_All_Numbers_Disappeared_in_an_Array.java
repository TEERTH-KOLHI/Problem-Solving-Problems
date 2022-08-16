/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an 
array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]

*/

import java.util.*;
class Find_All_Numbers_Disappeared_in_an_Array{
	public static void main(String...args){
		int nums[] = {1,2};// {1,1,2,2};//{4, 3, 2, 7, 8, 2, 3, 1};
		
		List<Integer> returned_list = findDisappearedNumbers(nums);
		
		System.out.print("[");
		for(int i = 0; i < returned_list.size(); i++){
			if(i < returned_list.size() -1){
				System.out.print(returned_list.get(i)+",");
			}else{
				System.out.print(returned_list.get(i));
			}
		}
		System.out.print("]");
	}
	public static List<Integer> findDisappearedNumbers(int[] nums){
		int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<=nums.length; i++){
            
            for(int j = 0; j<nums.length; j++){
                if(i == nums[j]){
                    count ++;
					break;
                }
            }
            if(count == 0){
                        list.add(i);
            }
            count = 0;
        }
        return list;
	}
}

