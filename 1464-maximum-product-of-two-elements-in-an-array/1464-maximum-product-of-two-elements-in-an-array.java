class Solution {
    public int maxProduct(int[] nums) {
        //also taking min value, because if we have negative numbers product will be equal to product of 2 min negative
       int max1=Integer.MIN_VALUE;
       int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max1)
            {
                max2=max1;
                max1=nums[i];
                
            }else if(nums[i]>max2)
                max2=nums[i];
            if(nums[i]<min1)
            {
                min2=min1;
                min1=nums[i];
            }
            else if(nums[i]<min2)
                min2=nums[i];
        }
        return Math.max((max1-1)*(max2-1),(min1-1)*(min2-1));
    }
}


