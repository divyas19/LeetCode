class Solution { 
        
    public long maximumSubarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        int  i=0,j=0;
        long max = 0;
        long sum = 0;
        
        while( j<nums.length )
        {
            if(hm.containsKey(nums[j]))
            {
                hm.put(nums[j],hm.get(nums[j])+1);
            }
            else
            {
                hm.put(nums[j],1);
            }
            
            sum += nums[j];
            
            if(j-i+1 < k)
            {      
            j++;
            }
            else if(j-i+1 == k)
            {
                if(hm.size()==k)
                max = Math.max(max,sum);
                
                if(hm.containsKey(nums[i]) && hm.get(nums[i])==1)
                    hm.remove(nums[i]);
                else
                {
                    hm.put(nums[i], hm.get(nums[i])-1);
                }
                
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return max;
    }
}
