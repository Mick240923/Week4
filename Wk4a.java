import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Wk4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an instance of an ArrayList of String called employeeNames
		//Add at least five entries to the employeeNames and ids (make sure both collections have the same number of entries).
		 ArrayList<String> employeeNames = new ArrayList<String>();
		    employeeNames.add("Kelli");
		    employeeNames.add("Yogi");
		    employeeNames.add("Jalyn");
		    employeeNames.add("Kyndal");
		    employeeNames.add("Ruthie");

		  //Create an instance of a HashSet of Integer called ids
		    HashSet<Integer> ids = new HashSet<Integer>();
		    ids.add(9);
		    ids.add(24);
		    ids.add(22);
		    ids.add(17);
		    ids.add(12);
		  //Create an instance of a HashMap of Integer, String called employeeMap 
		    Map<Integer, String> employeeMap = new HashMap<Integer, String>();	
		    int i = 0;
			for (int id : ids) {
			employeeMap.put(id, employeeNames.get(i));
				i++; 
			}
			
			//Once the employeeMap is fully populated, use another enhanced for loop to iterate over the employeeMap.keySet(),
			//and use the key for each current iteration to print to the console both the current key and its associated value in the map.
			Set<Integer> employeeKeys = employeeMap.keySet();
			for(int employeeKey : employeeKeys) {
				System.out.println(employeeKey + " : " + employeeMap.get(employeeKey));
			}

			//Create a StringBuilder called idsBuilder
			StringBuilder idsBuilder = new StringBuilder();
			//Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.
			for(int id : ids) {
				idsBuilder.append(id + " - ");
			}
			//Print the result of idsBuilder.toString() to the console.
			System.out.println(idsBuilder.toString());
			
			//Create another StringBuilder called namesBuilder.
			StringBuilder namesBuilder = new StringBuilder();
			
			//Iterate over the employeeNames ArrayList and append each name, followed by a space “ “ to the namesBuilder.
			for (String employee : employeeNames) {
				namesBuilder.append(employee + " ");
			}
			//Print the result of namesBuilder.toString() to the console.
			System.out.println(namesBuilder.toString());
		}	
	}
