/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
	    Scanner sc= new Scanner(System.in);
	    int t= sc.nextInt();
	    while(t-->0){
	        int n =sc.nextInt();
	        int arr[]= new int[n];
	        for(int i=0;i<n;i++)
	          arr[i]=sc.nextInt();
	       frequencySort(arr);
	       System.out.println();
	    }
	}
	public static void frequencySort(int[] arr)
	{
	    HashMap<Integer, Integer> count= new HashMap<>();
	    for(int n: arr)
	      count.put(n, count.getOrDefault(n,0)+1);
	      
	    PriorityQueue<Integer> heap= new PriorityQueue<>((a,b) -> (count.get(a)==count.get(b)) ? a-b : count.get(b)- count.get(a));
	    
	    for(int n: count.keySet())
	       heap.offer(n);
	       
	   int res[]= new int[arr.length];
	   
	   int i=0;
	   while(!heap.isEmpty())
	   {
	       int val=heap.poll();
	       if(count.containsKey(val))
	       {
	           int times= count.get(val);
	           while(times>0)
	           {
	            res[i++]=val;
	            times--;
	           }
	       }
	   }
	   for(int j=0;j<res.length;j++)
	   System.out.print(res[j]+" ");
	    
	}
}