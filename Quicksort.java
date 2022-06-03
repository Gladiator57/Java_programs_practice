class Quicksort{
    int temp;
    int partition(int arr[],int low, int high){
        int pivot = arr[high];
        int i=low-1;
        for(int j =low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
        
    }
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
           
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }


static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
public static void main(String args[])
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        System.out.println("Elements in array before sorting are : ");
        for(int q=0;q<n;q++){
            System.out.print(arr[q]+" ");
        }
        System.out.println("");
        Quicksort ob = new Quicksort();
        ob.sort(arr, 0, n-1);
        
  
        System.out.println("Elements in array after Sorting are :");
        printArray(arr);
}
}