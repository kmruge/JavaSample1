package oopsApplicationConcept;

public class passengger {
	private int busNumber;
	private String name;
	private int capacity;
	passengger(int busNumber,String name,int capacity)
	{
		this.busNumber=busNumber;
		this.name=name;
		this.capacity=capacity;
	}
	public String toString()
	{
		return this.busNumber+" "+this.name+" "+this.capacity;
	}
}
