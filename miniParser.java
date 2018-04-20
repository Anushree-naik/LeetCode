
class Solution {
    public NestedInteger deserialize(String s) 
    {
        
        Stack<NestedInteger> stack = new Stack<NestedInteger>();
        String tmp = "";
        for(char c: s.toCharArray())
        {
            switch(c)
            {
                case '[':
                    stack.push(new NestedInteger());
                    break;
            
                case ']':
                    if(!tmp.equals(""))
                    {
                        stack.peek().add(new NestedInteger(Integer.parseInt(tmp)));
                        tmp="";
                    }
                
                    NestedInteger top = stack.pop();
                    if(!stack.empty())
                    {
                        stack.peek().add(top);
                    }
                    else
                        return top;
                
                    break;
                
                case ',':
                    if(!tmp.equals(""))
                    {
                        stack.peek().add(new NestedInteger(Integer.parseInt(tmp)));
                        tmp="";
                    }
                
                    break;
            
                default:
                    tmp += c;
            }
        }
    
        if(!tmp.equals(""))
        {
            return new NestedInteger(Integer.parseInt(tmp));
        }
        return null;
    }
        
}