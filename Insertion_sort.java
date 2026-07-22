public class Main{
    public static void main(String [] args){

        int arr[]= {10,1,5,7,9,8,12,13,15,14};
        insertion_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print("| "+arr[i]+" |");
        }
    }




    // worst case time complexity is O(n^2)
    public static void insertion_sort(int []arr){

for(int i=1;i<arr.length;i++){


int k=arr[i];
int j;
for(j=i-1;j>=0 && arr[j]>k;j--){
arr[j+1]=arr[j];
}


arr[j+1]=k;


}



}





    
}
