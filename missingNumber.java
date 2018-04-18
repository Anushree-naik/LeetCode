class Solution 
{
    public int missingNumber(int[] n) 
    {
        int result = n.length;   

        for(int i=0; i<n.length; i++)
            result ^= i ^ n[i];
        System.out.println("Missing number is: "+result);
        
        return result;
    }
}