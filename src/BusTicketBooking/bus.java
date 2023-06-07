package BusTicketBooking;

import java.util.Date;

public class bus {
	private int busNo;
	private int capacity;
	private Date date;
	bus(int busNo, int capacity)
	{
		this.busNo=busNo;
		this.capacity=capacity;
	}
	public int getcapacity()
	{
		return capacity;
	}
	public void setcapacity(int capacity)
	{
		this.capacity=capacity;
	}
	public String toString()
	{
		return "BusNO "+this.busNo+" capacity "+this.capacity;
	}

}
