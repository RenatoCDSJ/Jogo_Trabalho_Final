package app;

public class NodeTree {
    //root's tree
    private Node<CDT> root;
    
    public NodeTree(Node<CDT> root){
        this.root = null;
    }
    //function responsible for creating a node before deployment
    public void NewNode(int index, int nodeCoin, int nodeDistance, boolean nodeTrade){
        CDT cdt = new CDT(nodeCoin, nodeDistance, nodeTrade);
        insert(index, cdt);

    }
    //recives the created node and calls the function insertNode and reset the root
    private void insert(int index, CDT cdt){
        System.out.println("novo nó index e CDT:" + index + cdt);
        root = insertNode(root, index, cdt);
        System.out.println("fim"+ root);
    }

    private Node<CDT> insertNode(Node<CDT> current, int index, CDT cdt){
        //if current is null put node in place
        if(current == null){
            System.out.println("caiu no conto do null");
            Node<CDT> node = new Node<CDT>(index, cdt);
            return node;
        }
        System.out.println("não foi no null");
        //if index greater than index current go to right node
        if(index > current.getIndex()){
            System.out.println("vai para a direita");
            insertNode(current.getRight(), index, cdt);
        }
        else if(index < current.getIndex()){
            System.out.println("vai para a esquerda");
            insertNode(current.getLeft(), index, cdt);
        }
        else{
            System.out.println("foi no else");
        }
        System.out.println("vai passar pelo return");
        return current;
    }
    public Node<CDT> getRoot() {
        return root;
    }
    public void setRoot(Node<CDT> root) {
        this.root = root;
    }
    
    
}
