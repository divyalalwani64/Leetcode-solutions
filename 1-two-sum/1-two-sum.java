class Solution {
    public int[] twoSum(int[] nums, int target) {
        //solved using hashmap
        int result[]=new int[2];
        HashMap<Integer,Integer> hm=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(target-nums[i]))
            {
                result[0]=hm.get(target-nums[i]);//getting index
                result[1]=i;
                break;
            }
            hm.put(nums[i],i);
        }
        return result;
        //TC: O(n)
        //SC: O(n) - due to hashmap
    }
}