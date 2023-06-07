package BusTicketBooking;

import java.util.ArrayList;
import java.util.Scanner;

public class Booking {

	public static void main(String[] args) {
		ArrayList<bus> buses=new ArrayList<bus>();
		buses.add(new bus(1,40));
		buses.add(new bus(2,35));
		buses.add(new bus(3,30));
		buses.forEach(b ->System.out.println(b));
		Scanner ji=new Scanner(System.in);
		System.out.println("Enter 1 to book 2 to exist");
		int input=ji.nextInt();
		while(input==1)
		{
			System.out.println("Booking.......");
			System.out.println("Enter 1 to book 2 to exist");
			input=ji.nextInt();
		}

	}

}
