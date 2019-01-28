import java.util.*;
class Circle
{
	private final double PI =3.14;
	private double radius;
	private String color;
	Circle()
	{
		radius=1;
		color="radius";
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	Circle(double radius,String color)
	{
		this.radius=radius;
		this.color=color;
	}
	public double getradius()
	{
		return radius;
	}
	public void setradius(double radius)
	{
		this.radius=radius;
	}
	public String getcolor()
	{
		return color;
	}
	public void setcolor(String color)
	{
		this.color=color;
	}
	public double getarea()
	{
	return PI*radius*radius;
	}
}


class Cylinder extends Circle
{
	private double height;
	Cylinder()
	{
		super();
		height=1;
	}
	Cylinder(double radius)
	{
		super(radius);
	}
	Cylinder(double radius,double height)
	{
		super(radius);
		this.height = height;
	}
	Cylinder(double radius,double height,String color)
	{
		super(radius,color);
		this.height=height;
	}
	public double getheight()
	{
		return height;
	}
	public void setheight()
	{
		this.height=height;
	}
	public double getvolume()
	{
		return super.getarea()*height;
	}
}


class Test
{
	public static void main(String args[])
	{
		Cylinder cl1=new Cylinder(2,3,"blue");
		System.out.println(cl1.getvolume());
		System.out.println(cl1.getarea());
		System.out.println(cl1.getcolor());
	}
}