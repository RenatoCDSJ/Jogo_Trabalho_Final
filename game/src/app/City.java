package app;
import java.util.ArrayList;

public class City {
	//"name" of the city, "powerAmount" for the amount of power the gem receives
	//The degree that the object will have on the Graph (how many links)
	//and finally the arraylist of neighboring cities

	private String name;
	private int powerAmount;
	private int degree;
	public ArrayList<City> neighbors = new ArrayList<City>();
	boolean questExist;
	private Integer graphPosition;
	public ArrayList<Integer> neighborsPosition = new ArrayList<Integer>();
	
	//constructor to define cities and their neighbors
	public City(String name, int powerAmount, boolean questExist,Integer graphPosition) {
		this.name = name;
		this.powerAmount = powerAmount;
		this.questExist = questExist;
		this.graphPosition = graphPosition;
	}

	//function to add neighbors
	public void makeNeighbors (City a) {
		if(!isVizinho(a)) {
			neighbors.add(a);
			neighborsPosition.add(a.getgraphPosition());
			degree += 1;
		}
	}

	//function to check if the city is already neighboring
	public boolean isVizinho (City a) {
		for (City city : this.neighbors) {
			if (city == a)
				return true;
		}
		return false;
	}

	//function to check the neighbors of the city
	public ArrayList<City> getNeighbors(){
		return this.neighbors;
	}

	//returns the name of the city and the other below returns the power that the city influences on the jewel
	public String cityName(){
		return this.name;
	}

	public int powerQtd(){
		return this.powerAmount;
	}

	public Integer getgraphPosition(){
		return this.graphPosition;
	}

	//returns the degree of the node City
	public int degreeQtd(){
		return this.degree;
	}

	public boolean getisquest(){
		return this.questExist;
	}

	public int neighborsSize(){
		return this.neighbors.size();
	}

	
	//Below... The ToSrting, not using now but someday it will rise again
	/*@Override
	public String toString() {
		return "City [neighbors=" + neighbors + "]";
	}
	*/
	
}
