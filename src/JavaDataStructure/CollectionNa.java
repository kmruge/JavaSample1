package JavaDataStructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionNa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> name=new HashMap<>();
		name.put(1, "Arun");
		name.put(2, "muru");
		name.put(3, "thiru");
		name.put(4, "krishna");
		name.put(5, "kumar");
		Set s=name.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer, String> map=(Map.Entry<Integer, String>)it.next();
			if(map.getKey().equals(2))
			{
				map.setValue("Arun");
			}
		}
		System.out.println(name);
		

	}

}
