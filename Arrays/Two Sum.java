Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

class Solution {
    public int[] twoSum(int[] nums, int target) {
       int b[] = new int[2];
        for(int p = 0; p < nums.length; p++)
        {
             for(int q = p+1; q < nums.length; q++)
             {
                 if((nums[p]+nums[q]) == target)
                 {
                     b[0] = p;
                     b[1] = q;
                 }
            
             }
            
        }
        return b; 
    }
}
