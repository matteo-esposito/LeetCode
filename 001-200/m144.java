import java.util.ArrayList;

class m144 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorderTraversalHelper(root, res);
        return res;
    }

    public void preorderTraversalHelper(TreeNode root, List<Integer> out) {
        if (root == null){
            return;
        }
        out.add(root.val);
        preorderTraversalHelper(root.left, out);
        preorderTraversalHelper(root.right, out);
    }
}