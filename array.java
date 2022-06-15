import java.util.*;

class array
{
	
public static void main(String args[])
{
	
int i,n;
int[] ar = new int[10]; 
Scanner sc = new Scanner(System.in);
System.out.println("Enter the elements");
  
for(i=0; i<10; i++)  
{  
//reading array elements from the user   
ar[i]=sc.nextInt();  
}  
System.out.println("ENtered Elements are :");
  for(i=0;i<10;i++){
	  System.out.print(ar[i]+"  ");
  }
}
}

