package app;

public class NodeCity {
    private Node head;
    private Node tail;

    // no que armazenda cidades e mostra a ultima visitada

    public NodeCity() {
        head = null;
        tail = null;
    }

    private class Node {
        String city;
        Node next;

        public Node(String city) {
            this.city = city;
            this.next = null;
        }
    }

    public void addCity(String city) {
        Node newNode = new Node(city);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void whereDidItComeFrom() {
        if (head == null) {
            System.out.println("Nenhuma cidade foi visitada ainda.");
        } else {
            Node currentNode = tail;
            System.out.println("Última cidade visitada: " + currentNode.city);
        }
    }
}


