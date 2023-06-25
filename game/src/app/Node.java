package app;
//generic class will enable shaping the class
public class Node <T>{
    //data can be coin, distance or trade 
    private T data;
    //idex's tree
    private int index;
    //two nodes connected to this node on left and right
    private Node<T> left;
    private Node<T> right;

    public Node(int index){
        this.index = index;
        this.left = null;
        this.right = null;
    }
    public Node(int index, T data){
        this.index = index;
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public Node<T> getLeft() {
        return left;
    }
    public void setLeft(Node<T> left) {
        this.left = left;
    }
    public Node<T> getRight() {
        return right;
    }
    public void setRight(Node<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + ", index=" + index + ", left=" + left + ", right=" + right + "]";
    }
    
    
}
