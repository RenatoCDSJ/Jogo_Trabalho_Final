package app;
//import java.util.ArrayList;

public class Graphtools {
	
	public void createneibhors(City n, City m) {
        n.makeNeighbors(m);
        m.makeNeighbors(n);
    }
	
	public void cityName(City n) {
		System.out.println(n.cityName());
	}
	
	public Graphtools() {
		
	}
	
	public void vizinhos(City z) {
		for (City elemento : z.neighbors) {
            System.out.println(elemento.cityName());
        }
	}
	

    
    
    
	
	
	
}
