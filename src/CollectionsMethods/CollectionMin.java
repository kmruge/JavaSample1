package CollectionsMethods;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionMin {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(98);
		list.add(82);
		list.add(6);
		list.add(50);
		System.out.println(Collections.min(list));
	}

}
