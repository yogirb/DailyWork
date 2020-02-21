package newproject;
import java.util.HashMap;
import java.util.Map.Entry;
//HashMap<String,Integer> map = new HashMap<>();
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Hashtable;


public class Mpping {

	public static void main(String[] args) {
		//HashMap<String,Integer> map = new HashMap<>();
		//LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
		//Hashtable<String,Integer> map = new Hashtable<>();
		
		
		TreeMap<String,Integer> map = new TreeMap<>();
		map.put("Banan",35);
		map.put("Orange",60);
		map.put("Mango",120);
		map.put("Grapes",200);
		map.put("Watemelon",25);
		map.put("Banan",70);
		
		
		//map.put(null,0);
	//	 System.out.println(map);
	//	 System.out.println(map.get("Mango"));
		
		for(Entry<String,Integer> entry: map.entrySet())
		{
			
			// System.out.println(entry.getKey());
			 System.out.println(entry.getKey()+"------->"+entry.getValue());
			
		}
		
		
	
	}

}
