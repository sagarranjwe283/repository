package assignment;

public class Rectangle
{
	private double length;
	private double breadth;
	Rectangle(double length,double breadth)
	{
		System.out.println("area: "+length*breadth);
	}
	public double getLength()
	{
		return length;
	}
	public double getBreadth()
	{
		return breadth;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public void setBreadth(double breadth)
	{
		this.breadth=breadth;
	}
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle(20.0,15.5);
		r.getLength();
		r.getBreadth();

		
	}

}
