// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            long L = Long.parseLong(a[0]);
            long R = Long.parseLong(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.primeProduct(L, R));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static long primeProduct(long L, long R){
        // code here
        long prod=1, m=1000000007;
        for(long i=L;i<=R;i++)
        {
            int flag=0;
            for(long j=2;j*j<=i;j++)
            {
                if(i%j==0)
                {
                  flag=1;
                  break;
                }
            }
            if(flag==0)
            {
             prod*=i;
             prod%=m;
            }
        }
        return prod;
    }
}