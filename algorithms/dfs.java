// Implementation of depth-first-search.
class dfs {
    public static void dfsTraversal(MyNode current){
        if (current == null){
            return;
        }
        System.out.print(current.data + " ");
        dfsTraversal(current.left);
        dfsTraversal(current.right);
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
        System.out.print("DFS: ");
        dfsTraversal(root); // DFS: 10 6 3 8 13 11 
    }
}