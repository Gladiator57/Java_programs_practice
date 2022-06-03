import java.util.Scanner;
class Mergesort{
void merge(int a[],int beg,int mid,int end){
    int i,j,k;
    int n1 = mid-beg+1;
    int n2 = end-mid;
      int nL[]= new int [n1];
      int nR[]= new int [n2];
      
      for(i=0;i<n1;i++){
          nL[i]=a[beg+i];
      }
      for(j=0;j<n2;j++){
          nR[j]=a[mid+1+j];
      }
      i=0;
      j=0;
      k=beg;
      
      while(i<n1&&j<n2){
          if (nL[i]<=nR[j]){
              a[k]=nL[i];
              i++;
          }
          else{
              a[k]=nR[j];
              j++;
          }
          k++;
      }
    while(i<n1){
        a[k]=nL[i];
        k++;
        i++;
    }
    while(j<n2){
        a[k]=nR[j];
        k++;
        j++;
    }
}
void mergeSort(int a[],int beg,int end){
    if(beg<end){
        int mid;
        mid=beg+ (end-beg)/2;
        mergeSort(a,beg,mid);
        mergeSort(a,mid+1,end);
        merge(a,beg,mid,end);
    }
}

void printArray(int a[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
        System.out.print(a[i] + " ");  
}
public static void main(String args[])  
{   
    int a[]=new int[8];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Unsorted array elements: ");
   // int q=sc.nextInt();
   for(int q=0;q<8;q++){
       a[q]=sc.nextInt();
   }
   // int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };  
    int n = a.length;  
    Mergesort m1 = new Mergesort();  
    System.out.println("\nBefore sorting array elements are - ");  
    m1.printArray(a, n);  
    m1.mergeSort(a, 0, n - 1);  
    System.out.println("\nAfter sorting array elements are - ");  
    m1.printArray(a, n);  
    System.out.println("");  
}  
}  