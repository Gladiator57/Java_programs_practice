
import java.util.*;
class demo{
	int f;
	void calc(int a,int b)
	{
		f=a*b;
		System.out.println(f);
	}
}

class maxmin
{
	
	public static void main(String args[]){
    Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
System.out.print("Enter first number- ");  
int a= sc.nextInt();  
System.out.print("Enter second number- ");  
int b= sc.nextInt(); 
demo d = new demo();
d.calc(12,23);
}
}