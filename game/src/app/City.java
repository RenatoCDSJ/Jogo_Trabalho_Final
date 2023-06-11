package app;
import java.util.ArrayList;

public class City {
    //name da cidade, a quantidade de poder que a jóia recebe
	//O grau que o objeto vai ter no Grafo (quantas ligações)
	//e por fim a arraylist das cidades vizinhas
	private String name;
	private int quantidadePoder;
	private int grau;
	private ArrayList<City> vizinhos = new ArrayList<City>();
	
	//construtor para definir as cidades e seus vizinhos
	public City(String name, int quantidadePoder) {
        this.name = name;
        this.quantidadePoder = quantidadePoder;
    }
	
	//função para adicionar vizinhos
	public void fazerVizinho (City a) {
        if(!isVizinho(a)) {
            vizinhos.add(a);
            grau += 1;
        }
    }
	
	//função para ver se a cidade já é vizinha
	public boolean isVizinho (City a) {
        for (City cidade : this.vizinhos) {
            if (cidade == a)
                return true;
        }
        return false;
    }
	
	//função para ver os vizinhos da cidade
	public ArrayList<City> getVizinhos(){
        return this.vizinhos;
    }
	
	//retorna o nome da cidade e a outra retorna o poder que a cidade influencia na joia
	public String nomeCity(){
        return this.name;
    }
	
	public int qtdPoder(){
        return this.quantidadePoder;
    }
    //logo posto algo que retorna o grau
}
