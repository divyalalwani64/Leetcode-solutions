class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,max=0;
        while(i<j)
        {
            int res=(j-i)*Math.min(height[i],height[j]);
            max=Math.max(max,res);
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return max;
    }
}