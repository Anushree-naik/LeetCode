public class Solution 
{
    public int totalHammingDistance(int[] nums) 
    {
        int result = 0; 
        int n = nums.length;
        for (int j=0;j<32;j++) 
        {
            int count = 0;
            for (int i=0;i<n;i++) 
                count += (nums[i] >> j) & 1;
            result += count*(n - count);
        }
        return result;
    }
}