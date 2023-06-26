package app;
import java.util.ArrayList;
//here im constructing the Graph

public class CityGraph {
	//the arraylist for getting all the cities in the continent, or "neighborhood"
	//cgh to call Graphtools, that helps in the contruction (making a class prove it to be less defective in tests)
	ArrayList<City> neighborhood;
	Graphtools cgh;
    
	//Here the Constructor to initialize the Graph when the Class's called
	public CityGraph() {
		initialize();
	}
	//run is a method created for tests
	public void run() {
		initialize();
	}
	//here we create the Cities with the constructor and add on the arraylist
	private void initialize() {
		neighborhood = new ArrayList<City>();
		neighborhood.add(new City("Ubud",0,false,0));//0
		neighborhood.add(new City("Principality of Nekikh",1,false,1));//1
		neighborhood.add(new City("Principality of Gritesthr",5,false,2));//2
		neighborhood.add(new City("Kingdom  of Lastwatch",-2,false,3));//3
		neighborhood.add(new City("Grand Duchy of Smalia",1,false,4));//4
		neighborhood.add(new City("Kingdom of Legmod",2,false,5));//5
		neighborhood.add(new City("Protectorate of Dogrove",3,false,6));//6
		neighborhood.add(new City("Kingdom of Oldcalia",4,false,7));//7
		neighborhood.add(new City("Kingdom of Kalb",2,true,8));//8
		neighborhood.add(new City("Vunese Empire",0,true,9));//9
		neighborhood.add(new City("Principality of Kasya",-7,false,10));//10
		neighborhood.add(new City("Aymar League",1,false,11));//11
		neighborhood.add(new City("Defalsia",-3,true,12));//12
		neighborhood.add(new City("Chandir Sultanate",1,false,13));//13
		neighborhood.add(new City("Bun",5,false,14));//14
		neighborhood.add(new City("Principality of Karhora",-2,false,15));//15
		neighborhood.add(new City("Nargumun",0,false,16));//16
		
		//cgh = Graphtools, for calling it now in this method
		cgh = new Graphtools();
		//14, east cities
		cgh.createneibhors(neighborhood.get(0),neighborhood.get(1));
		cgh.createneibhors(neighborhood.get(0),neighborhood.get(5));
		cgh.createneibhors(neighborhood.get(1),neighborhood.get(2));
		cgh.createneibhors(neighborhood.get(1),neighborhood.get(5));
		cgh.createneibhors(neighborhood.get(2),neighborhood.get(3));
		cgh.createneibhors(neighborhood.get(2),neighborhood.get(5));
		cgh.createneibhors(neighborhood.get(2),neighborhood.get(6));
		cgh.createneibhors(neighborhood.get(5),neighborhood.get(6));
		cgh.createneibhors(neighborhood.get(5),neighborhood.get(7));
		cgh.createneibhors(neighborhood.get(6),neighborhood.get(3));
		cgh.createneibhors(neighborhood.get(6),neighborhood.get(7));
		cgh.createneibhors(neighborhood.get(3),neighborhood.get(7));
		cgh.createneibhors(neighborhood.get(3),neighborhood.get(4));
		cgh.createneibhors(neighborhood.get(4),neighborhood.get(7));
		//16, west cities
		cgh.createneibhors(neighborhood.get(7),neighborhood.get(8));
		cgh.createneibhors(neighborhood.get(7),neighborhood.get(11));
		cgh.createneibhors(neighborhood.get(7),neighborhood.get(12));
		cgh.createneibhors(neighborhood.get(12),neighborhood.get(11));
		cgh.createneibhors(neighborhood.get(8),neighborhood.get(9));
		cgh.createneibhors(neighborhood.get(8),neighborhood.get(11));
		cgh.createneibhors(neighborhood.get(11),neighborhood.get(9));
		cgh.createneibhors(neighborhood.get(11),neighborhood.get(13));
		cgh.createneibhors(neighborhood.get(11),neighborhood.get(14));
		cgh.createneibhors(neighborhood.get(11),neighborhood.get(16));
		cgh.createneibhors(neighborhood.get(11),neighborhood.get(15));
		cgh.createneibhors(neighborhood.get(15),neighborhood.get(16));
		cgh.createneibhors(neighborhood.get(16),neighborhood.get(14));
		cgh.createneibhors(neighborhood.get(14),neighborhood.get(13));
		cgh.createneibhors(neighborhood.get(13),neighborhood.get(10));
		cgh.createneibhors(neighborhood.get(13),neighborhood.get(9));
		
		//cgh.cityName(neighborhood.get(1));
		//just some test
	}
	
	public void cityName(int a) {
		cgh.cityName(neighborhood.get(a));
	}
	
	public void neighbors(int a) {
		cgh.vizinhos(neighborhood.get(a));
	}
	
	public int qtdneighbors(int a) {
		return cgh.qtdvizinhos(neighborhood.get(a));
	}
	
	public int specifcNeighb(int a,int b){
		return cgh.specifcNeighb(neighborhood.get(a),b);
	}
}
