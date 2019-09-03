import java.util.LinkedList;
import java.util.Queue;

// Implementation of breadth-first-search.
class bfs {
    public static void bfsTraversal(MyNode current){
        Queue<MyNode> q = new LinkedList<MyNode>();
        q.add(current); // Add root

        // Visit all children, one level at a time.
        while (!q.isEmpty()){
            current = q.remove();
            System.out.print(current.data + " ");

            if (current.left != null){
                q.add(current.left);
            }
            if (current.right != null){
                q.add(current.right);
            }
        }
    }

    public static MyNode createTree(){
        MyNode root = new MyNode(10, new MyNode(6, 
                                 new MyNode(3), new MyNode(8)),
                                 new MyNode(13, 
                                 new MyNode(11), null));

        return root;
    }

    public static void main(String[] args){
        MyNode root = createTree();
        System.out.print("BFS: ");
        bfsTraversal(root); // BFS: 10 6 13 3 8 11 
    }
}