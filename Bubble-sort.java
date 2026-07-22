public class Main{
    public static void main(String [] args){

        int arr[]= {10,1,5,7,9,8,12,13,15,14};
        bubble_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print("| "+arr[i]+" |");
        }
    }




    // worst case time complexity is O(n^2)
    public static void bubble_sort(int []arr){


boolean swaped=true;
while(swaped){
    swaped=false;

for(int i=1;i<arr.length;i++){

if(arr[i]<arr[i-1]){
int temp= arr[i];
arr[i]=arr[i-1];
arr[i-1]=temp;
swaped=true;
}

}




}





    }
}
