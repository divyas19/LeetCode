Given a positive integer n, find the pivot integer x such that:

The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.
  
class Solution {
    public int pivotInteger(int n) {
        // Scanner sc = new Scanner(System.in);
        int a[]=new int[n];
        for(int k = 0 ; k < n; k++)
        {
            a[k] = k+1;
        }
        int sl=0;
        int sr =a[n-1];
        int l = 0,r= n-2;
       while(l<r)
       {
           if(sl<=sr)
           {
              sl+=a[l];
               l++;
           }
           else if(sl>sr)
           {
               sr+=a[r];
               r--;
           }
        }
        if(n==1)
            return 1;
        if(sl == sr)
        {
          return a[r];
        }
        return -1;
    }
}
