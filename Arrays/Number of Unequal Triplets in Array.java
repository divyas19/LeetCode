You are given a 0-indexed array of positive integers nums. Find the number of triplets (i, j, k) that meet the following conditions:

0 <= i < j < k < nums.length
nums[i], nums[j], and nums[k] are pairwise distinct.
In other words, nums[i] != nums[j], nums[i] != nums[k], and nums[j] != nums[k].
Return the number of triplets that meet the conditions.
  
  
  
class Solution {
    public static int unequalTriplets(int[] nums) {
        int ct = 0;
        int n= nums.length;
        if(nums.length < 3)
            return 0;
     for(int i = 0;i<n-2;i++) 
     {
         for(int j = i+1;j<n-1;j++)
         {
            for(int k = j+1; k < n;k++)
            {
                if( (nums[i] != nums[j] ) && (nums[j] != nums[k]) && (nums[k] != nums[i] ) )
                {
                    ct++;
                }
            }
         }
      }
       return ct ;
    }
    
}
