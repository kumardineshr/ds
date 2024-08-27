package com.arraysandhashing;
/*
Given an integer array nums, return true if any value appears at least twice in the array, 
and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109
*/

import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }
    
    public static void main(String args[]) {
    		int[] nums1 = {1,2,3,1}, nums2 = {1,2,3,4}, nums3 = {1,1,1,3,3,4,3,2,4,2};
    	ContainsDuplicate obj = new ContainsDuplicate();
    	System.out.println("num1: " +obj.containsDuplicate(nums1));
    	System.out.println("num2: " +obj.containsDuplicate(nums2));
    	System.out.println("num3: " +obj.containsDuplicate(nums3));
    }
}