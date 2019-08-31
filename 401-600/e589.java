import java.util.ArrayList;
import java.util.List;

class e589 {
    
    class Node {
        public int val;
        public List<Node> children;
    
        public Node() {}
    
        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    // recursive approach.
    public List<Integer> preorder(Node root){
        List<Integer> ans = new ArrayList<>();
        preorderhelper(root, ans);
        return ans;
    }

    public void preorderhelper(Node root, List<Integer> sol) {
        if (root == null){
            return;
        } 
        
        sol.add(root.val);
        for (Node child: root.children){
            preorderhelper(child, sol);
        }
    }
}