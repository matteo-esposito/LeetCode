class e101 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return symTest(root.left, root.right);
    }

    public boolean symTest(TreeNode t1, TreeNode t2){
        if (t1 == null && t2 == null){
            return true;
        }
        if (t1 == null || t2 == null){
            return false;
        }
        if (t1.val != t2.val){
            return false;
        }
        return symTest(t1.left, t2.right) && symTest(t1.right, t2.left);
    }
}