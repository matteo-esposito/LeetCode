import java.util.ArrayList;

class m094 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderTraversalHelper(root, res);
        return res;
    }

    public void inorderTraversalHelper(TreeNode root, List<Integer> out) {
        if (root == null){
            return;
        }
        inorderTraversalHelper(root.left, out);
        out.add(root.val);
        inorderTraversalHelper(root.right, out);
    }
}