package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, find my voice");
        //creating a NodeTree object
        NodeTree tree = new NodeTree(null);
        //node coin
        //root
        tree.NewNode(20, 5, 0, false);
        //node distance
        tree.NewNode(10, 0, 3, false);
        tree.NewNode(30, 0, 3, false);
        //node trade
        tree.NewNode(5, 0, 0, false);
        tree.NewNode(15, 0, 0, false);
        tree.NewNode(25, 0, 0, true);
        tree.NewNode(35, 0, 0, true);
        System.out.println(tree.getRoot().toString());
    }
}
