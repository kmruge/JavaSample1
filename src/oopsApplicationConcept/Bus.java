package oopsApplicationConcept;

public class Bus {
	private int number;
	private int capacity;
	private String Ac;
	Bus(int number,int capacity, String Ac)
	{
		this.number=number;
		this.capacity=capacity;
		this.Ac=Ac;
	}
	public int getNumber()
	{
		return this.number;
	}
	public int getCapacity()
	{
		return this.capacity;
	}
	public String getAc()
	{
		return this.Ac;
	}
	public void setCapacity(int capacity)
	{
		this.capacity=capacity;
	}
	public void setAc(String ac)
	{
		this.Ac=ac;
	}
	public String toString()
	{
		return this.number+" "+this.capacity+" "+this.Ac;
	}
}
