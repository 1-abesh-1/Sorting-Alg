public class Main{
    public static void main(String [] args){

        int arr[]= {10,10,1,5,7,9,8,12,13,15,14};
        quick_sort(arr, 0, arr.length- 1);
        for(int i=0;i<arr.length;i++){
            System.out.print("| "+arr[i]+" |");
        }
    }

public static int partition(int arr[],int low, int high){
int pivot=arr[high];
int i=low-1;
 for (int j = low; j < high; j++){

        if (arr[j] < pivot){
i = i+1;
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
        }
      
 
 }
 int temp=arr[i+1];
arr[i+1]=arr[high];
arr[high]=temp;
      
    return i+1;
}

    // worst case time complexity is O(nlog(n))
    public static void quick_sort(int arr[], int low, int high){

         if (low < high){

        int pivotIndex = partition(arr, low, high);

        quick_sort(arr, low, pivotIndex - 1);

        quick_sort(arr, pivotIndex + 1, high);
         }
 
}





    
}
