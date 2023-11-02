package Phase1Module1;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		Map<String, Integer> vehicles = new HashMap<>();
		 
        vehicles.put("BMW", 10);
        vehicles.put("Mercedes-Benz", 13);
        vehicles.put("Audi", 9);
        vehicles.put("Bugatti", 7);
        vehicles.put("Lamborghini", 5);
        
 
        System.out.println("Total vehicles: " + vehicles.size());
 
      
        for (String key : vehicles.keySet())
            System.out.println(key + " - " + vehicles.get(key));
        System.out.println();
 
        String searchKey = "Bugatti";
        if (vehicles.containsKey(searchKey))
            System.out.println("Found total " + vehicles.get(searchKey) + " " + searchKey + " cars!\n");

	}

}
