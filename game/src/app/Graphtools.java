package app;
//import java.util.ArrayList;
//here is a class made to help with the construction of the Graph, the tools are here!

public class Graphtools {
	//this is used to create a link in the node with two cities
	public void createneibhors(City n, City m) {
        n.makeNeighbors(m);
        m.makeNeighbors(n);
    }
	//a get to get the city name
	public void cityName(City n) {
		System.out.println(n.cityName());
	}
	//constructor
	public Graphtools() {

	}

	//it prints all the neighbors
	public void vizinhos(City z) {
		int i = 1;
		for (City elemento : z.neighbors) {
            System.out.println(i+" "+elemento.cityName());
			i++;
        }
	}
	
	public int qtdvizinhos(City z){
		return z.neighborsSize();
	}

	public int specifcNeighb(City z,int a){
		return z.neighborsPosition.get(a);
	}
    
    
    public int fatorial(int num){
		int total = 0;
		if(num > 0){
			total = num * fatorial(num - 1);
		}else{
			total = 1;
		}
		return total;
	}
	
	
	
}
