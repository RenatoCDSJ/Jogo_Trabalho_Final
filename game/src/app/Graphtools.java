package app;
//import java.util.ArrayList;
//here is a class made to help with the construction of the Graph, the tools are here!

import java.util.InputMismatchException;
import java.util.Scanner;

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
    
    public void descocamento(Maxwell m){
        CityGraph cidadinha = new CityGraph();
		Scanner scanner = new Scanner(System.in);
		boolean sair = false;
        int numero = m.getCurrentCity();
		Dialogues dia = new Dialogues();

		dia.clearTerminal();
		while(!sair){
			System.out.println("======================");
			System.out.println("Cidade Atual\n");
			cidadinha.cityName(numero);
			System.out.println("======================");
			System.out.println("Vizinhos\n");
			cidadinha.neighbors(numero);
			System.out.println("\n======================");
			System.out.println("Diga a próxima cidade:\n");
			try {
                int escolha = scanner.nextInt();
                if (escolha >= 1 && escolha <= cidadinha.qtdneighbors(numero)) {
                    //"numero" is the current city 
					m.setCurrentCity(escolha);
					//numero = cidadinha.specifcNeighb(numero,escolha-1);
                    sair = true;
                } else {
					dia.clearTerminal();
                    System.out.println("Escolha inválida. Tente novamente.\n");
                }
            } catch (InputMismatchException e) {
				dia.clearTerminal();
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine(); 
            }
		}
		
		
		scanner.close();

    }
    
	
	
	
}
