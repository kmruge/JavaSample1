package oopsApplicationConcept;
import java.util.*;
public class Booking {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Bus> list=new ArrayList<Bus>();
		list.add(new Bus(123,5,"yes"));
		list.add(new Bus(456,4,"no"));
		list.add(new Bus(789,3,"yes"));
		ArrayList<passengger> passen=new ArrayList<passengger>();
		System.out.println("Available bus Details");
		for(Bus ji:list)
		{
			System.out.println(ji);
		}
		System.out.println("Enter 1 to book the bus 2 to exist");
		int initiate=scan.nextInt();
		while(initiate==1)
		{
			System.out.println("Booking process.........................");
			System.out.println("please bus number");
			int a=scan.nextInt();
			System.out.println("plese passengger name");
			String b=scan.next();
			System.out.println("please Enter No.of seat");
			int c=scan.nextInt();
			passen.add(new passengger(a,b,c));
			System.out.println("Enter 1 to book the bus 2 to exist");
			initiate=scan.nextInt();
		}
		for(passengger op:passen)
		{
			System.out.println(op);
		}
	}

}
