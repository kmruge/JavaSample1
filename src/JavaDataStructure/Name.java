package JavaDataStructure;

import java.util.ArrayList;

public class Name {

	public static void main(String[] args) {
		String name= "Thiru0Murugan9Murugesh5Arun";
		String[] nm=name.split("\\d");
		for(String n:nm) {
			System.out.println(n.toUpperCase());
		}
		ArrayList<String>arr=new ArrayList<>();
		
	}

}
