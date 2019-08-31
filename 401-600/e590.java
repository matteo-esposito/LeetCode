import java.util.ArrayList;
import java.util.List;

class e590 {
    
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
    public List<Integer> postorder(Node root){
        List<Integer> ans = new ArrayList<>();
        postorderhelper(root, ans);
        return ans;
    }

    public void postorderhelper(Node root, List<Integer> sol) {
        if (root == null){
            return;
        } 
        
        for (Node child: root.children){
            postorderhelper(child, sol);
        }
        sol.add(root.val);
    }
}