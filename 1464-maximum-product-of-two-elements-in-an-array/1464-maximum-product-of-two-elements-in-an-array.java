class Solution {
    public int maxProduct(int[] nums) {
        //3rd approach
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                max=Math.max(max,(nums[i]-1)*(nums[j]-1));
            }
        }
        return max;
    }
}

// 1st approach
// sort the array & multiply last 2 elements.
// Arrays.sort(nums);
// return (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
    
// 2nd approach
// create max tree, multiply root & max of left & right child.

//3rd approach
//use two loops i and j , calculate (nums[i]-1)*(nums[j]-1) && find maximum.
    

