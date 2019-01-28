abstract class Shape
{
	double length;
	double breadth;
	Shape()
	{
		length=0;
		breadth=0;
	}
	abstract double area(double length, double breadth);
	void display()
	{
		System.out.println("The area is ");	
	}
}

class Rectangle extends Shape
{
	Rectangle()
	{
		super();
	}
	double area(double length, double breadth)
	{
		double Area;
		Area=length*breadth;
		return Area;
	}
	void display()
	{
		System.out.println("The area of rectangle is " + area(5,6));
	}
}

class Triangle extends Shape
{
	Triangle()
	{
		super();
	}
	double area(double base,double height)
	{
		 double Area;
		 Area=(base*height)/2;
		 return Area;
	}
	void display()
	{
		System.out.println("The area of triangle is " +area(3,4));
	}
}

class ShapeTest
{
	public static void main(String[] args)
	{
		Rectangle R= new Rectangle();
		Triangle T=new Triangle();
		R.display();
		T.display();
	}
}