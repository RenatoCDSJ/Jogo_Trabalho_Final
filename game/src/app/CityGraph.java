package app;

import java.util.ArrayList;

public class CityGraph {
	ArrayList<City> neighborhood;
	Graphtools cgh;
    
	public CityGraph() {
		initialize();
	}
	public void run() {
		initialize();
	}
	private void initialize() {
		neighborhood = new ArrayList<City>();
		neighborhood.add(new City("Ubud",0));//0
		neighborhood.add(new City("Principality of Nekikh",1));//1
		neighborhood.add(new City("Principality of Gritesthr",5));//2
		neighborhood.add(new City("Kingdom  of Lastwatch",-2));//3
		neighborhood.add(new City("Grand Duchy of Smalia",1));//4
		neighborhood.add(new City("Kingdom of Legmod",2));//5
		neighborhood.add(new City("Protectorate of Dogrove",3));//6
		neighborhood.add(new City("Kingdom of Oldcalia",4));//7
		neighborhood.add(new City("Kingdom of Kalb",2));//8
		neighborhood.add(new City("Vunese Empire",0));//9
		neighborhood.add(new City("Principality of Kasya",-7));//10
		neighborhood.add(new City("Aymar League",1));//11
		neighborhood.add(new City("Defalsia",-3));//12
		neighborhood.add(new City("Chandir Sultanate",1));//13
		neighborhood.add(new City("Bun",5));//14
		neighborhood.add(new City("Principality of Karhora",-2));//15
		neighborhood.add(new City("Nargumun",0));//16
		
		//cgh = Graphtools
		cgh = new Graphtools();
		//14
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
		//16
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
		
	}
	
	public void cityName(int a) {
		cgh.cityName(neighborhood.get(a));
	}
	
	public void neighbors(int a) {
		cgh.vizinhos(neighborhood.get(a));
	}
	
	
	
}
