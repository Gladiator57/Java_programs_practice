import java.util.*;

/*public class recursive
{
	int n;
	int factorial(n)
	{
		
	if(n==0)
	{
		return 1;
	}

		else 
		{
			return (n*factorial(n-1));
		}
		
	}
}*/
public class recursive
{
	
public static void main(String args[])
{
	int fact=1,a,i,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number : ");
	a= sc.nextInt();
	//void calc(a);
	if(a==0)
	{
		System.out.println("1");
	}
	else{
		for(i=1;i<=a;i++)
		{
		  fact=fact*i;
		}
		
	}
	System.out.println("Factorial of a is "+ fact);
}

}
