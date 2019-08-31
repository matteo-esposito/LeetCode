// Generic node class to aid in illustrating different traversals.
public class MyNode {
    MyNode left;
    MyNode right;
    int data;

    public MyNode(int data){
        this.data = data;
    }

    public MyNode(int data, MyNode left, MyNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}