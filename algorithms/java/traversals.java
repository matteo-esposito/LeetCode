// Implementation of depth-first-search.
class traversals {

    // RECURSIVE IMPLEMENTATIONS
    public static void preOrderTraversal(MyNode current){
        if (current == null){
            return;
        }
        System.out.print(current.data + " ");
        preOrderTraversal(current.left);
        preOrderTraversal(current.right);
    }

    public static void inOrderTraversal(MyNode current){
        if (current == null){
            return;
        }
        inOrderTraversal(current.left);
        System.out.print(current.data + " ");
        inOrderTraversal(current.right);
    }

    public static void postOrderTraversal(MyNode current){
        if (current == null){
            return;
        }
        postOrderTraversal(current.left);
        postOrderTraversal(current.right);
        System.out.print(current.data + " ");
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
        System.out.print("Preorder: ");
        preOrderTraversal(root); // Preorder: 10 6 3 8 13 11 
        System.out.print("\nInorder: ");
        inOrderTraversal(root); // Inorder: 3 6 8 10 11 13 
        System.out.print("\nPostorder: ");
        postOrderTraversal(root); // Postorder: 3 8 6 11 13 10 
    }
}