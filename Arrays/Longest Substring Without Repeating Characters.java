class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int i=0;
        int j=0;
        int ans = 0;
        
        while(j<s.length())
        {
           char chr = s.charAt(j);
           if(hm.containsKey(chr))
               hm.put(chr,hm.get(chr)+1);
           else
               hm.put(chr,1);
               
           if(hm.size()==j-i+1)
           {
               ans = Math.max(ans,hm.size());
               j++;
           }
            else if(hm.size() < j-i+1)
            {
                while(hm.size() < j-i+1)
                {
                    char ch = s.charAt(i);
                      hm.put(ch,hm.get(ch)-1);
                    
                    if(hm.get(ch)==0)
                        hm.remove(ch);
                    
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}
