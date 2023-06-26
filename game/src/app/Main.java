package app;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Tree tree = new Tree();
        CDT cdt = new CDT(5, 2, 1);
        tree.TreeMap(cdt);
        game.play();
    }
}
