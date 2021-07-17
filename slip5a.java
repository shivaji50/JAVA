//slip5.a
//30
//Define an abstract class shape with abstract methods
//area() and volume().write a java program to calculate
//area and volume of cone and cylinder.
import java.lang.*;
abstract class shape
{
	int r;
	final float PI=3.14f;
	shape(int a)
	{
		r=a;
	}
	abstract void area();
	abstract void volume();
}

class sphere extends shape
{
	float a,v;
	sphere(int a)
	{
		super(a);
	}
	void area()
	{
		a=(float)4.0*PI*r*r;
		System.out.println("Area of sphere is "+a);
	}
	void volume()
	{
		v=(float)((4*PI*r*r*r)/3);
		System.out.println("volume of sphere is "+v);
	}
}

class cone extends shape
{
	float a,v,l,h;
	cone(int a)
	{
		super(a);
		l=4.0f;
		h=4.0f;
	}
	void area()
	{
		a=PI*r*(r+l);
		System.out.println("Area of cone is "+a);
	}
	void volume()
	{
		v=(1.0f/3.0f)*PI*r*r*h;
		System.out.println("Volum e of cone is "+v);
	}
}

class cylinder extends shape
{
	float a,v,h;
	cylinder(int a)
	{
		super(a);
		h=4.0f;
	}
	void area()
	{
		a=2.0f*PI*r*(r+h);
		System.out.println("Area of a cylinder is "+a);
	}
	void volume()
	{
		v=PI*r*r*h;
		System.out.println("Volume of cylinder is "+v);
	}
}

class slip5a
{
	public static void main(String[] args) 
	{
		sphere sp=new sphere(2);
		sp.area();
		sp.volume();
		cone c=new cone(6);
		c.area();
		c.volume();
		cylinder cy=new cylinder(8);
		cy.area();
		cy.volume();
    }
}