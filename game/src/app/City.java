package app;
import java.util.ArrayList;

public class City {
    //"name" of the city, "powerAmount" for the amount of power the gem receives
	//The degree that the object will have on the Graph (how many links)
	//and finally the arraylist of neighboring cities
	private String name;
	private int powerAmount;
	private int degree;
	private ArrayList<City> neighbors = new ArrayList<City>();
	
	//constructor to define cities and their neighbors
	public City(String name, int powerAmount) {
        this.name = name;
        this.powerAmount = powerAmount;
    }
	
	//function to add neighbors
	public void fazerNeighbors (City a) {
        if(!isVizinho(a)) {
            neighbors.add(a);
            degree += 1;
        }
    }
	
	//function to check if the city is already neighboring
	public boolean isVizinho (City a) {
        for (City cidade : this.neighbors) {
            if (cidade == a)
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
    //returns the degree of the node City
    public int degreeQtd(){
        return this.degree;
    }
    
}
