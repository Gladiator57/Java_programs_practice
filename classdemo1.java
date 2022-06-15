class Circle{
double x,y;
double r;
double circumference(){
	return(2*3.14)*r;
}
double area()
{
	return(3.14)*r*r;
	
}
}
class Cuboid
{
	double l,b,h;
	double circumference(){
		return(l*b*h);
	}
}

class classdemo1{

	public static void main(String args[])
	{

		Circle c = new Circle();
		Cuboid d = new Cuboid();
		d.l=5.3;
		d.b=6.1;
		d.h=4.3;
		c.x=9.0;
		c.y=3.0;
		c.r=8.0;
		System.out.println("Circumference = " + c.circumference());
		System.out.println("Area = "+c.area());
	
		System.out.println("Circumference = " + d.circumference());
		
	}
}
