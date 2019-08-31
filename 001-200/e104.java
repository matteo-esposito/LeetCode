class e104 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null){
            return 0;
        }
        TreeNode[] children = {root.left, root.right};
        for (TreeNode child : children){
            depth = Math.max(maxDepth(child), depth);
        }
        return depth+1;  
    }
}