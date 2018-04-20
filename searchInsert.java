class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        if (nums==null)
            return -1;
        
        if(target>nums[nums.length-1])
            return nums.length;
        
        int i=0;
        int j=nums.length;
        
        while (i<j)
        {
            int middle = (i+j)/2;
            
            if(target>nums[middle])
                i=middle+1;
            else 
                j=middle;
            
        }
        return j;
    }
    
}
