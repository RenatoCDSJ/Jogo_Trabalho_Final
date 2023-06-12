package app;
//generic class will enable shaping the class
public class Node <T>{
    //data can be coin, distance or trade 
    private T data;
    //idex's tree
    private int index;
    //two nodes connected to this node on left and right
    Node<T> left;
    Node<T> right;

    public Node(int index){
        this.index = index;
    }
    public Node(int index, T data){
        this.index = index;
        this.data = data;
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
    
}
