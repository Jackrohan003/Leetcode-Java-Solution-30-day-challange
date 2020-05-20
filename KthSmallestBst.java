/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

     
    public int kthSmallest(TreeNode root, int k) {
   
        AtomicInteger cnt= new AtomicInteger();
        AtomicInteger result = new AtomicInteger();
    
            inorder(root,k,cnt,result);
            return result.get();
    
    }
   
    void inorder(TreeNode root,int k,AtomicInteger cnt,AtomicInteger result)
    {
        
        if(root.left!=null)
            inorder(root.left,k,cnt,result);
        
            cnt.getAndIncrement();
            if(cnt.get()==k)
            {
                result.set(root.val);
                return;
                
            }
                if(root.right !=null)    
            inorder(root.right,k,cnt,result);
    
    }
    
}
