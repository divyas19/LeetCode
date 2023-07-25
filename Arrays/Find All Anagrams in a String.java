class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l = new ArrayList<Integer>();
        int k = p.length();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i =0; i < p.length();i++)
        {
            if(hm.containsKey(p.charAt(i)))
            {
               hm.put(p.charAt(i), hm.get(p.charAt(i))+1);
            }
            else
            {
                hm.put(p.charAt(i), 1);
            }
        }
        
        int ct = hm.size();
        int i=0, j=0;
       while(j< s.length()) 
       {
           if(hm.containsKey(s.charAt(j)))
           {
              hm.put(s.charAt(j), hm.get(s.charAt(j))-1);
              if((hm.get(s.charAt(j)) == 0))
               ct--;
           }
           
           
           if(j-i+1 <k)
               j++;
           else if(j-i+1 ==k)
           {
                if(ct==0) 
                    l.add(i);
                    char ci=s.charAt(i);
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
        
        return l;
    }
}
