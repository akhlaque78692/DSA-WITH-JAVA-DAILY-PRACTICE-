
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root==null){
                 return root;

            }
            if(root.val == p.val ||  root.val==q.val){
                   return root;
            }
            // if(root.right ==null && root.left!=null){
            //        return lowestCommonAncestor(root.left, p ,  q); 
            // }
            TreeNode  left =  lowestCommonAncestor(root.left  ,  p ,  q);
            TreeNode  right =  lowestCommonAncestor(root.right  ,  p  ,q);
            if(left!=null && right!=null){
                   return root;
            }
            if(left!=null && right==null){
                 return left;
            }
            if(right!=null && left==null){
                return  right;
            }
            
        
        return null;
    }
}