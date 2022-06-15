import java.util.*;

class demo
{
	int f,x,y;
	{
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
System.out.print("Enter first number- ");  
int a= sc.nextInt();  
System.out.print("Enter second number- ");  
int b= sc.nextInt(); 

if(a>b)
	System.out.println("A is greater");
else
	System.out.println("B is greater");
	}
	
void calc(int x,int y){
	
	f=x*y;
	System.out.println(f);
}
void disp()
	{
		System.out.println("Program done");
	}
	
}
class maxmin
{
	
	public static void main(String args[]){
    demo d = new demo();
	d.disp();
	d.calc(32,45);
}
}