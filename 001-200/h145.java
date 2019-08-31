import java.util.ArrayList;

class h145 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorderTraversalHelper(root, res);
        return res;
    }

    public void postorderTraversalHelper(TreeNode root, List<Integer> out) {
        if (root == null){
            return;
        }
        postorderTraversalHelper(root.left, out);
        postorderTraversalHelper(root.right, out);
        out.add(root.val);
    }
}