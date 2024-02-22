class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int maxx = 0;
        int ct=0;
        for(int i = 0; i < nums.length;i++)
        {
            if(nums[i]!=1)
            {
                maxx= Math.max(maxx,ct);
ct = 0;

            }
           else
            ct++;

        }
         maxx= Math.max(maxx,ct);
         return maxx;
    }
}
