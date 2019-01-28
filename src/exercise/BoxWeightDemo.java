import java.util.*;
class Box
{
	float width;
	float depth;
	float height;
	Box()
	{
		width=0;
		depth=0;
		height=0;
	}
	Box(float width, float depth, float height)
	{
		this.width=width;
		this.depth=depth;
		this.height=height;
	}
	Box(float width, float height)
	{
		this.width=width;
		this.height=height;
	}
	float getwidth()
	{
		return width;
	}
	float getdepth()
	{
		return depth;
	}
	float getheight()
	{
		return height;
	}
	void setDimension(float width, float depth, float height)
	{
		this.width=width;
		this.depth=depth;
		this.height=height;
	}
	float display()
	{
		float vol;
		vol=getwidth()*getdepth()*getheight();
		System.out.println("volume is " + vol);
		return vol;
	}

}

class BoxWeight extends Box
{
	float weight;
	BoxWeight()
	{
		super();
	}
	BoxWeight(float width, float depth, float height, float weight)
	{
		super(width, depth, height);
		this.weight=weight;
	}
	BoxWeight(float width, float height)
	{
		super(width, height);
	}
	float getweight()
	{
		return weight;
	}
	void setDimension(float width, float depth, float height, float weight)
	{
		super.setDimension(width, depth, height);
		this.weight=weight;
	}
	float display()
	{
		weight = getwidth()*getdepth()*getheight()*getweight();
		System.out.println("Weight is " + weight);
		return weight;
	}
}

class BoxWeightDemo
{
	public static void main(String[] args)
	{
		float width;
		float depth;
		float height;
		float weight;
		Scanner in =new Scanner(System.in);
		BoxWeight obj =new BoxWeight();
		BoxWeight obj1 =new BoxWeight(3,4,5,6);
		System.out.println("Enter width ");
		width=in.nextFloat();
		System.out.println("Enter depth ");
		depth=in.nextFloat();
		System.out.println("Enter height ");
		height=in.nextFloat();
		System.out.println("Enter weight ");
		weight=in.nextFloat();
		obj.setDimension(width,depth,height,weight);
		obj1.display();
	}
}