import java.util.LinkedList;
import java.util.Queue;

class e559 {
    class Node {
        public int val;
        public List<Node> children;
    
        public Node() {}
    
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    
    public int maxDepth(Node root) {
        int depth = 0;
        if (root == null){
            return 0;
        }
        for (Node child: root.children){
            depth = Math.max(maxDepth(child), depth);
        }
        return depth+1;
    }
}