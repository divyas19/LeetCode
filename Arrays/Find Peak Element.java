class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==1 || nums[0]>nums[1])
            return 0;
        else if(nums[n-2]<nums[n-1])
            {
             return n-1;
    }
    else{
        int i = 1;
        while(i<n-1)
            {
            if(nums[i-1]<nums[i] && nums[i]>nums[i+1])
                return i;
            i++;
        }
    }
    return n-1;
}}
