
class Car2
{
	int f;
 Car2()
 {
 System.out.println("COnstructor is Created");
 }


 Car2(int a,int b)

 {
	
	f=a+b; 
 System.out.println("COnstructor is again Created" + " "+ f);

 }
 
//class vehicle

public static void main(String args[])
{
	int a,b;
	
Car2 c = new Car2();
Car2 c2 = new Car2(87,23);
System.out.println("Constuctor will invoke");
}
}


 