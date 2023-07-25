class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i =0; i < s1.length();i++)
        {
            if(hm.containsKey(s1.charAt(i)))
            {
               hm.put(s1.charAt(i), hm.get(s1.charAt(i))+1);
            }
            else
            {
                hm.put(s1.charAt(i), 1);
            }
        }
        
        int ct = hm.size();
        int i=0, j=0;
       while(j< s2.length()) 
       {
           if(hm.containsKey(s2.charAt(j)))
           {
              hm.put(s2.charAt(j), hm.get(s2.charAt(j))-1);
              if((hm.get(s2.charAt(j)) == 0))
               ct--;
           }
           
           
           if(j-i+1 <k)
               j++;
           else if(j-i+1 ==k)
           {
                if(ct==0)
                  return true;  
               
                char ci=s2.charAt(i);
                if(hm.containsKey(ci))
                {
                    hm.put(ci,hm.get(ci)+1);
                    if(hm.get(ci)==1)
                    ct++;
                }
                    
               j++;
               i++;
           }

       }
        return false;
        
    }
}
    
