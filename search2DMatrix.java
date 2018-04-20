public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        
        int i = 0;
        int j = 0;
        boolean flag=false;
        
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==target)
                {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
        
    }
}