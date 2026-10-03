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
    int  k ;
    int ans ; 
    boolean found =false ; 

    public int  kthSmallest(TreeNode root, int k){
          ans  = 0 ;
         this.k = k ;
         Smallest(root );
      return ans ;
         
    }
    public void Smallest(TreeNode root ) {
             if(root==null|| found){
                 return;
             }
             
             if(found){
                return;
             }
             Smallest(root.left );
               k=k-1;
               if(k==0){
                ans  = root.val;
                found  =  true;
                return ;
             }
             Smallest(root.right );
             
    }
}