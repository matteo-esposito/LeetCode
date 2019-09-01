class e111 {
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
        
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        int leftdepth = Integer.MAX_VALUE; 
        int rightdepth = Integer.MAX_VALUE;
        if (root.left != null) {leftdepth = minDepth(root.left);}
        if (root.right != null) {rightdepth = minDepth(root.right);}

        return Math.min(leftdepth, rightdepth) + 1;
    }
}