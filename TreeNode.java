/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode root) 
    {
         ArrayList<Integer> list = new ArrayList<Integer>();
 
         if(root == null)
            return list; 
 
         Stack<TreeNode> S = new Stack<TreeNode>();
       
         TreeNode R = root;
 
         while(!S.empty() || R != null)
         {
            if(R != null)
            {
                S.push(R);
                R = R.left;
            }
            else
            {
                TreeNode T = S.pop();
                list.add(T.val);
                R = T.right;
            }
        }
 
        return list;
    }
}
