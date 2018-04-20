public class Solution
{
    char[][] a ={{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
    public List<String> letterCombinations(String digits)
    {
        if(digits.length()==0)
        {
            return new ArrayList<String>();
        }
        
        if(digits.length()==1)
        {
            List<String> result = new ArrayList<String>();
            int i = Integer.parseInt(digits);
            for(char c : a[i])
            {
                result.add(Character.toString(c));
            }
            return result;
        }
        
        int j = Integer.parseInt(digits.substring(0,1));
        List<String> res = new ArrayList<String>();
        
        for(char c : a[j])
        {
            for(String ss : letterCombinations(digits.substring(1)))
            {
                res.add(c+ss);
            }
        }
        return res;
    }
}