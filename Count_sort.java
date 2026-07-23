public class Main{
    public static void main(String [] args){

        int arr[]= {10,10,1,5,7,9,8,12,13,15,14};
        count_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print("| "+arr[i]+" |");
        }
    }




    // worst case time complexity is O(n+k)
    public static void count_sort(int []arr){

int max=arr[0];
for(int i=1;i<arr.length;i++){
if(arr[i]>max){
    max=arr[i];
}

}

int marr[]=new int[max+1];


for(int i=0;i<arr.length;i++){
    marr[arr[i]]++;
}



int j=0;
for(int i=0;i<marr.length;i++){
int l=marr[i];
while(l>0){
    arr[j]=i;
    j++;
    l--;
}



}



}





    
}
