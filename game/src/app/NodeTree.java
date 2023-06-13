package app;

public class NodeTree {
    //root's tree
    private Node<CDT> root;
    
    public NodeTree(Node<Integer> root){
        this.root = null;
    }
    //function responsible for creating a node before deployment
    public void NewNode(int index, int nodeCoin, int nodeDistance, boolean nodeTrade){
        CDT cdt = new CDT(nodeCoin, nodeDistance, nodeTrade);
        Node<CDT> node = new Node<CDT>(index, cdt);
        insert(index, node);

    }
    //recives the created node and calls the function insertNode and reset the root
    private void insert(int index,Node<CDT> node){
        root = insetNode(root, index, node);

    }

    private Node<CDT> insetNode(Node<CDT> current,int index, Node<CDT> node){
        //if current is null put node in place
        if(current == null){
            return node;
        }
        return current;
    }
}
