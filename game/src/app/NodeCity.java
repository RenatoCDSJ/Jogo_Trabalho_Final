package app;

public class NodeCity {

    // head
    // tail
    private Node CurrentCity;
    private Node LastCity;

    // no que armazenda cidades e mostra a ultima visitada
    

    public NodeCity() {
        CurrentCity = null;
        LastCity= null;
    }

    private class Node {
        String city;
        Node next;

        public Node(String city) {
            this.city = "cidade1";
            this.next = null;
        }
    }

    public void addCity(String city) {
        Node newNode = new Node(city);

        if ( CurrentCity == null) {
             CurrentCity = newNode;
            LastCity = newNode;
        } 
        else {
            LastCity.next = newNode;
            LastCity = newNode;
        }
    }
// funçao que mostra a ultima cidade que foi adcionada
// function that shows the last city that was added

    public void whereDidItComeFrom() {
        if ( CurrentCity == null) {
            System.out.println("Nenhuma cidade foi visitada ainda.");
        } 
        else {
            Node currentNode = LastCity;
            System.out.println("Última cidade visitada: " + currentNode.city);
        }
    }
}


