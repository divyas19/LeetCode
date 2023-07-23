class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> l = new ArrayList<Integer>();
        
        int comp = nums.length/3;
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int val : nums)
        {
            if(hm.containsKey(val))
            {
                hm.put(val,hm.get(val)+1 );
            }
            else
            {
                hm.put(val, 1);
            }
        }
        
        Set<Integer> values = hm.keySet();
        
        for(int val : values)
        {
            if(hm.get(val) > comp)
            {
                l.add(val);
            }
        }
        
        return l;
    }
}
